/**
 * 
 */
package com.integration.filter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.file.filters.FileListFilter;
import org.springframework.stereotype.Component;

/**
 * @author speddyre
 *
 */
@Component
public class ValidatingFilter implements FileListFilter<Object> { //implements MessageSelector {
	public static final Logger LOG = LoggerFactory.getLogger(ValidatingFilter.class);

	/*@Override
	public boolean accept(Message<?> message) {
		LOG.info("In ValidatingFilter with message ="+message);		
		String fileName = ((File)message.getPayload()).getName();				
		if(validateFileName(fileName)){
			LOG.info("rejecting file for processing");
			return false;
		}else{
			LOG.info("accepting file for processing");
			return true;
		}
	}*/
	
	/**
	 * Checking for done string in fileName
	 * @param fileName
	 * @return
	 */
	private boolean validateFileName(String fileName){
		/*LOG.info("validating fileName");*/
		return fileName.contains("PASSED");
	}

	@Override
	public List filterFiles(Object[] files) {
		List<File> fileList = new ArrayList<File>();
		for(int i=0; i<files.length;i++){
			File file = (File)(files[i]);
			if(!validateFileName(file.getPath())){
				fileList.add(file);
			}
		}
		return fileList;
	}
}
