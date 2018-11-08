package com.curso.spring.ejercicio.nosql;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.curso.spring.ejercicio.nosql.services.AltaSaludosGenerados;

@Configuration
public class Configuracion {

	@Bean
	@Autowired
	public MessageListenerAdapter listenerAdapter(AltaSaludosGenerados receiver) {
		return new MessageListenerAdapter(receiver, "receiveMessage");
	}

	@Bean
	public Queue queue() {
		return new Queue("spring-boot", false);
	}

	@Bean
	public SimpleMessageListenerContainer container(
			ConnectionFactory connectionFactory,
			MessageListenerAdapter listenerAdapter) {
		SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
		container.setConnectionFactory(connectionFactory);
		container.setQueueNames("spring-boot");
		container.setMessageListener(listenerAdapter);
		return container;
	}

}
