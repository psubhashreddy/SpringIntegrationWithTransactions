/**
 * 
 */
package com.integration.generator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.file.DefaultFileNameGenerator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author speddyre
 *
 */
@Component
public class NameGenerator  extends DefaultFileNameGenerator{
	public static final Logger LOG = LoggerFactory.getLogger(NameGenerator.class);
	
	public NameGenerator() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    public String generateFileName(Message<?> message) {
		LOG.info("In NameGenerator with message ="+message);
		String outputFileName = message.getHeaders().get("output-file").toString();
		LOG.info("Output file name ="+outputFileName);
		return outputFileName;
    }	
}
