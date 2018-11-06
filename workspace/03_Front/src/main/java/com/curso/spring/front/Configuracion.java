package com.curso.spring.front;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Configuracion {

	//<bean id="restTemplate" 
	//			class="org.springframework.web.client.RestTemplate">
	//</bean>
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
