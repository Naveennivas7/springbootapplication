package dev.naveen.helloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class HelloWorldControler {
    @GetMapping("/h")
    String HelloWorld(){
        return "hello world!";
    }
}
