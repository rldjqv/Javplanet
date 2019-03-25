package kr.co.javplanet;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
//public class Application extends SpringBootServletInitializer {
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//    return builder.sources(Application.class);
//    }
//   
//	public static void main(String[] args) throws Exception {
//		SpringApplication.run(Application.class, args);
//	}
//}

public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		try {
		} catch (BeansException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}