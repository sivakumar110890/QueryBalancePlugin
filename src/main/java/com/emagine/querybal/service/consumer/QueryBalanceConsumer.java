package com.emagine.querybal.service.consumer;

import org.apache.log4j.Logger;

import com.emagine.kafka.consumer.EventConsumer;
import com.emagine.querybal.service.IQueryBalanceService;
import com.emagine.querybal.service.QueryBalanceServcie;

/**
 * Topic subscriber class listens to topic and processes the messages.
 * 
 */
public class QueryBalanceConsumer extends EventConsumer {

	private static final Logger LOGGER = Logger.getLogger(QueryBalanceConsumer.class);

	public QueryBalanceConsumer(String groupId, String topic, int threads) {
		super(groupId, topic, threads);
	}

	@Override
	public void onRecieve(String message, int threadId) {
		LOGGER.info("onRecieve method :: [Start] - [Thread Id]=[" + threadId + "] Message ==> " + message);
		try {
			/*
			 * Remove [ "" ], Because while Volt pushing the msg to kafka it
			 * adds "" internally.
			 */
			if (message.startsWith("\"")) {
				message = message.subSequence(1, message.length() - 1).toString();
				message = message.replace("\"\"", "\"");
			}
			IQueryBalanceService queryBalanceService = new QueryBalanceServcie();
			queryBalanceService.processQueryBalanceRequest(message);
			LOGGER.info("onRecieve method :: [END] - [Thread Id]=[" + threadId + "]");
		} catch (Exception e) {
			LOGGER.error("onRecieve method :: [ERROR OCCURED]  thread Id =[" + threadId + "] :: Message = "
					+ e.getMessage());
		}
	}
}
