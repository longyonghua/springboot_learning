package com.longge;

import com.longge.filter.FirstFilter;
import com.longge.servlet.SecondServlet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@ServletComponentScan
//@MapperScan("com.longge.dao")
public class SpringbootHelloworld2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloworld2Application.class, args);
	}
	/*@Bean
    public FilterRegistrationBean getFilter(){
	    FilterRegistrationBean bean = new FilterRegistrationBean(new FirstFilter());
	    bean.addUrlPatterns("/myFilter");
	    return bean;
    }
	@Bean
    public ServletRegistrationBean getServlet(){
	    ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
	    bean.addUrlMappings("/second");
	    return bean;
    }*/

}
