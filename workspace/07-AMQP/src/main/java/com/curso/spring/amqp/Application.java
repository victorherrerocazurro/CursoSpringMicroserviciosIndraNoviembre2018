package com.curso.spring.amqp;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		rabbitTemplate.convertAndSend(
				"spring-boot-exchange", //Identificador del Exxchange que recive los mensajes 
				"foo.bar.baz", //Categoria de los mensajes que indica al Exchange a que Queue ha de enviar los mensajes 
				"Hello from RabbitMQ!"); //Mensaje

	}
}
