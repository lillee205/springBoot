package io.javabrains.springbootquickstart.courseapi.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class HelloController {
    @RequestMapping("/hello") // by default, requestmapping only does GET; need to specify if otherwise
    public String sayHi() {
        return "Hi";
    }
}