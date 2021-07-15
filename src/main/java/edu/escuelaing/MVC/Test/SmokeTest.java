package edu.escuelaing.MVC.Test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.escuelaing.MVC.Controllers.HomeController;

@SpringBootTest
public class SmokeTest {

	@Autowired
	private HomeController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
}