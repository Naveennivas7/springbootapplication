package dev.naveen.helloworld;


import dev.naveen.helloworld.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

//CRUD -create read update delete
public interface TodoRepository implements JpaRepository<Todo,Long> {

}