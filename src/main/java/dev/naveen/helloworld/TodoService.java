package dev.naveen.helloworld;

import dev.naveen.helloworld.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepositary;


    public Todo createTodo(Todo todo){
        return todoRepositary.save(todo);
    }




}
