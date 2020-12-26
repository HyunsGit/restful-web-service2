package com.example.restfulwebservice.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // Get
    // hello-world (endpoint)
    // @RequestMapping(method=requestMethod.GET, path="/hello-world")
    @GetMapping(path = "/hello")
    public String helloWorld(){
        return "Sleep AllDay";
    }

    @GetMapping(path = "/hello-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Sleep AllDay");
    }

    @GetMapping(path = "/hello-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        return new HelloWorldBean("Sleep AllDay" + name);
    }
}
