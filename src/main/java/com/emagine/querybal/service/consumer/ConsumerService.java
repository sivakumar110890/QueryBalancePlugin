package com.emagine.querybal.service.consumer;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.emagine.querybal.config.PropertiesLoader;
import com.emagine.querybal.utils.QueryBalanceConstant;

@Component
public class ConsumerService implements IConsumerService {

	private static final Logger LOGGER = Logger.getLogger(ConsumerService.class);

	private QueryBalanceConsumer queryBalanceConsumer = null;

	public String startQueryBalanceConsumer() throws Exception {
		try {
			LOGGER.info("startQueryBalanceConsumer method :: [Start]");
			String queryMgrTopic = PropertiesLoader.getValue(QueryBalanceConstant.QUERY_MGR_CONSUMER_TOPIC);
			String topicArray = queryMgrTopic;
			String[] topicDetails = topicArray.split(":");
			String topic = topicDetails[0];
			String groupId = topicDetails[1];
			int threadCount = Integer.parseInt(topicDetails[2]);
			queryBalanceConsumer = new QueryBalanceConsumer(groupId, topic, threadCount);
			queryBalanceConsumer.startConsumer();
			LOGGER.info("startQueryBalanceConsumer method :: [End]");
		} catch (ArrayIndexOutOfBoundsException ex) {
			throw new Exception("INCORRECT Configuration in query_balance.properties for querymgr.consumer.topic ");
		}
		return "SUCCESS";
	}

	public String stopQueryBalanceConsumer() throws Exception {
		LOGGER.info("stopQueryBalanceConsumer method :: [Start]");
		boolean isConsumerNull = false;
		if (queryBalanceConsumer != null) {
			queryBalanceConsumer.shutdownAllConsumers();
		} else {
			isConsumerNull = true;
		}
		if (isConsumerNull) {
			forceStopConsumer();
		}
		LOGGER.info("stopQueryBalanceConsumer method :: [End]");
		return "SUCCESS";
	}

	/**
	 * @throws Exception
	 */
	private void forceStopConsumer() throws Exception {
		try {
			String rewardsTopic = PropertiesLoader.getValue(QueryBalanceConstant.QUERY_MGR_CONSUMER_TOPIC);
			String topicArray = rewardsTopic;
			String[] topicDetails = topicArray.split(":");
			String topic = topicDetails[0];
			String groupId = topicDetails[1];
			int threadCount = Integer.parseInt(topicDetails[2]);
			queryBalanceConsumer = new QueryBalanceConsumer(groupId, topic, threadCount);
			queryBalanceConsumer.shutdownAllConsumers();
		} catch (ArrayIndexOutOfBoundsException ex) {
			throw new Exception("INCORRECT Configuration in query_balance.properties for querymgr.consumer.topic ");
		}
	}

}
