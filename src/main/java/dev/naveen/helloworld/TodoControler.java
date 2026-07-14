package dev.naveen.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/todo")

public class TodoControler {
    @Autowired
    private TodoService todoService;
    @GetMapping("/get")
    String gettodo() {
        todoService.getTodo();
        return "todo";
    }
//path variable
    @GetMapping("/{id}")
    String gettodobyid(@PathVariable int id) {
        return "todo with id  "+id;
    }



    //request param
    @GetMapping("")
    String gettodobyidparam(@RequestParam("todoid") int id) {
        return "todo with id  "+id;
    }

    @PostMapping("/create")
    String createuser(@RequestBody String body) {
        return body;
    }



    @PutMapping ("/{id}")
    String updatetodobyid(@PathVariable long id){
        return "update todo with id "+ id;
    }

    @DeleteMapping ("/{id}")
    String deletetodobyid(@PathVariable long id){
        return "delete todo with id "+ id;
    }

}