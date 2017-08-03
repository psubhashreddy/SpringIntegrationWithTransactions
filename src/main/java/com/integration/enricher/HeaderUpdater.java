/**
 * 
 */
package com.integration.enricher;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author speddyre
 *
 */
@Component
public class HeaderUpdater {
	public static final Logger LOG = LoggerFactory.getLogger(HeaderUpdater.class);
	
	public String updateHeader(Message<?> message){
		LOG.info("In HeaderUpdater with message as input parameter="+message);
		File inputFile = (File)message.getPayload();
		return inputFile.getName().replaceAll("input", "output");
	}
}
