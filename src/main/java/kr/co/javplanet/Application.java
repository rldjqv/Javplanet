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
public class Application {

	public static void main(String[] args) {
//		SpringApplication app = new SpringApplication(BatchMonitorApplication.class);
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		try {
//			GoodsListDto goodsList = context.getBean(GoodsService.class).getGoodsList(new GoodsParam());
//			context.getBean(GoodsPickService.class).setGoodsList(goodsList.list);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
