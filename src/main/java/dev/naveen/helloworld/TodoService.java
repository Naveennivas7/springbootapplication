package dev.naveen.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepositary;



    public void getTodo(){
        System.out.println(todoRepositary.getAllTodos());
    }

}
