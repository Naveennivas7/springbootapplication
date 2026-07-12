package dev.naveen.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/todo")

public class TodoControler {
    @GetMapping("/get")
    String gettodo() {
        return "todo";
    }
//path variable
    @GetMapping("/{id}")
    String gettodobyid(@PathVariable int id) {
        return "todo with id  "+id;
    }



    //request param
    @GetMapping("")
    String gettodobyidparam(@RequestParam int id) {
        return "todo with id  "+id;
    }
}