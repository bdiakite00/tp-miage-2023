package com.acme.todolist;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;;

/**
 * DAO d'accès aux TodoItem
 * @author bflorat
 *
 */
@RequestMapping
public interface TodoItemRepository extends CrudRepository<TodoItem,String> {
	
	List<TodoItem> findAll(); 
	
	Optional<TodoItem> findById(String id);
	
	
}
