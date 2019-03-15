package test.layer.learner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import test.layer.learner.service.GreetService;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GreetControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@SpyBean
	private GreetService greetService;

	@Test
	public void should_greet_with_name() throws Exception {
		String name = "afar";
		String greeting = "Hello " + name;
		given(greetService.greetWith(name)).willReturn(greeting);

		this.mockMvc.perform(get("/" + name))
					.andExpect(status().isOk())
					.andExpect(content().string(containsString(greeting)));

		verify(greetService, times(1)).greetWith(name);
	}

}
