package dev.naveen.helloworld;

public class TodoService {
    private TodoRepository todoRepositary;


    public TodoService(){
        todoRepositary=new TodoRepository();
    }
    public void getTodo(){
        System.out.println(todoRepositary.getAllTodos());
    }

}
