package com.njust.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncodeUtil {

	public static String encryptMD5(String str) {
		return encrypt(str, "MD5");
	}

	public static String encryptSHA(String str) {
		return encrypt(str, "SHA");
	}

	public static String encrypt(String str, String algorithm) {
		MessageDigest digest;
		try {
			digest = MessageDigest.getInstance(algorithm);
			digest.update(str.getBytes());
			return toHex(digest.digest());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();

			return null;
		}
	}

	public static String toHex(byte[] b) {
		StringBuffer sb = new StringBuffer(b.length * 3);
		for (int i = 0; i < b.length; ++i) {
			sb.append(Character.forDigit((b[i] & 0xF0) >> 4, 16));
			sb.append(Character.forDigit(b[i] & 0xF, 16));
		}
		return ((sb != null) ? sb.toString().toUpperCase() : null);
	}

}