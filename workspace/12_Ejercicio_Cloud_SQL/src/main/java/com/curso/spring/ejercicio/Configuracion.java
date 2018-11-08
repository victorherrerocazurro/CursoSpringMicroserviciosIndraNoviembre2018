package com.curso.spring.ejercicio;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Configuracion {

	//Configuracion RestTemplate
	
	@Bean
	//Anotacion que activa el descubrimiento de servicios en el servidor Eureka por su identificador 
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplateBuilder().setConnectTimeout(2000).build();
	}
	
	//Configuracion AMQP
	
	@Bean
	public Queue queue() {
		return new Queue("spring-boot", false);
	}

	@Bean
	public TopicExchange exchange() {
		return new TopicExchange("spring-boot-exchange");
	}

	@Bean
	@Autowired
	public Binding binding(@Qualifier("queue") Queue queue, TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with("foo.bar.#");
	}
}