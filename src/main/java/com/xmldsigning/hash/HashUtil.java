package com.xmldsigning.hash;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.io.IOUtils;

import com.xmldsigning.constants.AppConstants;

import lombok.Data;

@Data
public class HashUtil {

	public static byte[] sha256(final File input) throws IOException, NoSuchAlgorithmException
	{
		FileInputStream fis = new FileInputStream(input);
		byte[] byteArray = IOUtils.toByteArray(fis);

		MessageDigest mDigest = MessageDigest.getInstance(AppConstants.HASH_ALGORITHM);
		return mDigest.digest(byteArray);
	}

}
