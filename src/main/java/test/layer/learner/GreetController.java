package test.layer.learner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import test.layer.learner.service.GreetService;

@RestController
public class GreetController {

    private GreetService greetService;

    public GreetController(GreetService greetService) {
        this.greetService = greetService;
    }

    @GetMapping("/{name}")
    public String greet(@PathVariable String name) {
        return greetService.greetWith(name);
    }
}
