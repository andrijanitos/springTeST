package com.andrijanica.SpringTest1.repository;

import com.andrijanica.SpringTest1.model.entity.Book;
import com.andrijanica.SpringTest1.model.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {

}
