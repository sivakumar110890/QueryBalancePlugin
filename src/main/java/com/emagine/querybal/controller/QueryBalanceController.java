package com.emagine.querybal.controller;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.emagine.kafka.publisher.EventPublisher;
import com.emagine.querybal.config.PropertiesLoader;
import com.emagine.querybal.service.consumer.IConsumerService;
import static com.emagine.querybal.utils.QueryBalanceConstant.*;

import java.util.Map;

@RestController
@RequestMapping("/querybalance")
public class QueryBalanceController {

	@Autowired
	private IConsumerService consumerService;

	private static final Logger LOGGER = Logger.getLogger(QueryBalanceController.class);

	@RequestMapping(value = "/publishevent", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
	public String publishEvent(@RequestBody(required = true) Map<String, String> runTimeValueMap) throws Exception {
		LOGGER.info(":: publishEvent method ::  START");
		JSONObject inputJsonObject = new JSONObject(runTimeValueMap);
		EventPublisher eventPublisher = new EventPublisher();
		eventPublisher.publishEvent(runTimeValueMap.get(QUERY_MGR_CONSUMER_TOPIC), inputJsonObject.toString());
		eventPublisher.close();
		LOGGER.info(":: publishEvent method :: END");
		return "SUCCESS";
	}

	@RequestMapping(value = "/startconsumer", method = RequestMethod.GET)
	public String startConsumers() throws Exception {
		LOGGER.info(":: startConsumers method ::");
		return consumerService.startQueryBalanceConsumer();
	}

	@RequestMapping(value = "/shutdownconsumer", method = RequestMethod.GET)
	public String shutdownConsumer() throws Exception {
		LOGGER.info(":: shutdownConsumer method ::");
		String status = " Shutdown FAILED !!";
		try {
			consumerService.stopQueryBalanceConsumer();
			status = " Shutdown Rewards Consumer SUCCESS";
		} catch (Exception e) {
			LOGGER.error("shutdownConsumer method :: Error occured !!!" + e.getMessage(), e);
			throw e;
		}
		return status;
	}

	@RequestMapping(value = "/reloadproperties", method = RequestMethod.GET)
	public String reloadProperties() throws Exception {
		String statusFlag = null;
		try {
			LOGGER.info("reloadProperties() method :: [Start] reloading the property file");
			statusFlag = PropertiesLoader.reloadProperties();
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("reloadProperties method :: Error occured !!! " + e.getMessage());
			throw e;
		}
		LOGGER.info("reloadProperties() method :: [END] reloaded the property file and Status ==>  " + statusFlag);
		return statusFlag;
	}
}
