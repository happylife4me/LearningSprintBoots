package dom.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

@Configuration
@ComponentScan(basePackages = "dom.demo.spring")
@EnableWebMvc
public class WebConfig {
	
	@Bean
	public ViewResolver viewResolver1(){
		ResourceBundleViewResolver rs = new ResourceBundleViewResolver();
		rs.setBasename("views");
		rs.setOrder(1);
		return rs;
	}
	
	
	@Bean
	public ViewResolver viewResolver2(){
		InternalResourceViewResolver rs = new InternalResourceViewResolver("/WEB-INF/pages", "page");
		rs.setOrder(2);
		return rs;
	}
}
