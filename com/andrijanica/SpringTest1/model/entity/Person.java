package com.andrijanica.SpringTest1.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;


import javax.persistence.*;

/**
 * Entity class representing Person model.
 */
@Entity
@Table(name = "person")
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;


    @OneToOne
    @JoinColumn(name="fk_author_id")
    private Book book;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
