package com.emagine.querybal.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import com.emagine.querybal.service.consumer.ConsumerService;
import com.emagine.querybal.service.consumer.IConsumerService;
import com.emagine.querybal.service.publisher.QueryBalancePublisher;

@WebListener
public class Config implements ServletContextListener {

	private IConsumerService consumerService;

	public Config() {
		consumerService = new ConsumerService();
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// We can use this method to start our consumers.
		try {
			System.out.println("QueryBalance plugin kick started. Starting all consumers !!");

			// Starting Consumer.
			consumerService.startQueryBalanceConsumer();

			// Starting Publisher
			QueryBalancePublisher.startPublisher();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// Important! This stops the thread.
		try {
			System.out.println("QueryBalance shutting down. Stopping all consumers !!");

			consumerService.stopQueryBalanceConsumer();

			QueryBalancePublisher.stopExecutorThread();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
