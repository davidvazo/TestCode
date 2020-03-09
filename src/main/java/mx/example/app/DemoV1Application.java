package mx.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"mx.example.app.expediente.controller,"
		+ "mx.example.app.expediente.service"})
public class DemoV1Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DemoV1Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoV1Application.class);
	}
}
