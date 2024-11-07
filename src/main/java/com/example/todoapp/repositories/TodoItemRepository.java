package com.example.todoapp.repositories;

import com.example.todoapp.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {



}
