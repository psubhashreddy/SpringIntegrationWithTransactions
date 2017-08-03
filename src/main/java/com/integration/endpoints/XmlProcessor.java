package com.integration.endpoints;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class XmlProcessor {
	public static final Logger LOG = LoggerFactory.getLogger(XmlProcessor.class);
	
	@ServiceActivator
	public File processXml(Message<?> message){
		LOG.info("In XMLProcessor with message ="+message);
		return (File) message.getPayload();
	}
}
