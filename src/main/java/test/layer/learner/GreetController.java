package test.layer.learner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/{name}")
    public String greet(@PathVariable String name) {
        return "Hello " + name;
    }
}
