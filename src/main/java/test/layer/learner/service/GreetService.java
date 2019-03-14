package test.layer.learner.service;

import org.springframework.stereotype.Service;

@Service
public class GreetService {
    public String greetWith(String name) {
        return "Hello " + name;
    }
}
