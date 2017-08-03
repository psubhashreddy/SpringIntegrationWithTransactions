/**
 * 
 */
package com.integration.transformer;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author speddyre
 *
 */
@Component
public class ContentTransformer {
	
	public static final Logger LOG = LoggerFactory.getLogger(ContentTransformer.class);
	
	public File transform(File file){
		LOG.info("In transformer ="+file.getPath());
		return file;
	}

}
