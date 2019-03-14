package test.layer.learner.service;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreetServiceTest {

    private GreetService greetService;

    @Before
    public void setUp() {
        greetService = new GreetService();
    }

    @Test
    public void should_greet_with_afar() {
        String result = greetService.greetWith("afar");
        assertThat(result)
                .isEqualTo("Hello afar");
    }

    @Test
    public void should_greet_with_daisy() {
        String result = greetService.greetWith("daisy");
        assertThat(result)
                .isEqualTo("Hello daisy");
    }
}