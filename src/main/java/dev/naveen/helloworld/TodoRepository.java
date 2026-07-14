package dev.naveen.helloworld;

import org.springframework.stereotype.Component;

@Component

public class TodoRepository {
    String getAllTodos(){
        return "Todos";
    }
}
