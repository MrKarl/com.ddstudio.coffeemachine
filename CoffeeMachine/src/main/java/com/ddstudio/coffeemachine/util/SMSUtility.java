package com.ddstudio.coffeemachine.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SMSUtility {
	public static final String API_KEY = "NCS5465AD7DDE621";
	public static final String API_SECRET = "1A8D5CA6BB0D72A1E25DAE8B3E42622C";
	public static final String API_URL = "https://api.coolsms.co.kr/sms/1.5/send";
	
	public String to;
	public String from;
	public String text;
	public String type;
	public String image;
	public String image_encoding;
	public String refname;
	public String country;
	public String datetime;
	public String subject;
	
	
	public String timestamp;
	public String salt;
	public String signature;
	
	public SMSUtility() {
//		salt = "thisisrandomsalt";
		
		Random r = new SecureRandom();
		
		byte[] saltByte = new byte[10];
		r.nextBytes(saltByte);
		
		salt = new String(saltByte);
		
		to = "01052274071";
		from = "01052274071";
		text = "this is sms test";
		type = "SMS";
		country = "KR";
	}
	
	private void encryptSignature() throws NoSuchAlgorithmException, InvalidKeyException {
		SecretKeySpec spec = new SecretKeySpec(API_SECRET.getBytes(), "hmacMd5");
		Mac mac = Mac.getInstance("hmacMd5");
		mac.init(spec);
		
		long timestampLong = System.currentTimeMillis() / 1000;
		timestamp = new String(Long.toString(timestampLong));
		
		String data = timestamp+salt;
		byte[] res = mac.doFinal(data.getBytes());
		signature = res.toString();
	}
	
	private String prepareData() {
		try {
			encryptSignature();
			Map<String, String> payload = new HashMap<>();
			payload.put("to",  to);
			payload.put("from", from);
			payload.put("text", text);
			payload.put("type", type);
			payload.put("api_key", API_KEY);
			payload.put("salt", salt);
			payload.put("signature", signature);
			payload.put("timestamp", timestamp);
			
			String jsonPayload = new ObjectMapper().writeValueAsString(payload);
			
			System.out.println("JSONPAYLOAD : " + jsonPayload);
			return jsonPayload;
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	
	public void sendSMS2() throws IOException{
		
		URL url = new URL(API_URL);
		HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
		
		httpURLConnection.setRequestMethod("POST");
		httpURLConnection.setRequestProperty("Content-type",  "application/json");
		httpURLConnection.setDoOutput(true);
		httpURLConnection.setDoInput(true);
		
		OutputStream outputStream = httpURLConnection.getOutputStream();
		outputStream.write(prepareData().getBytes());
		outputStream.flush();
		outputStream.close();
		
		System.out.println("RESPONSE CODE : " + httpURLConnection.getResponseCode());
		
		
		
		StringBuilder builder = new StringBuilder();
		builder.append(httpURLConnection.getResponseCode())
		       .append(" ")
		       .append(httpURLConnection.getResponseMessage())
		       .append("\n");

		Map<String, List<String>> map = httpURLConnection.getHeaderFields();
		for (Map.Entry<String, List<String>> entry : map.entrySet())
		{
		    if (entry.getKey() == null) 
		        continue;
		    builder.append( entry.getKey())
		           .append(": ");

		    List<String> headerValues = entry.getValue();
		    Iterator<String> it = headerValues.iterator();
		    if (it.hasNext()) {
		        builder.append(it.next());

		        while (it.hasNext()) {
		            builder.append(", ")
		                   .append(it.next());
		        }
		    }

		    builder.append("\n");
		}

		System.out.println(builder);
		
	}
	
	
	
	public void sendSMS() throws IOException {
		String apiurl = "http://api.coolsms.co.kr/sendmsg?user=simplefit&password=simplename1&to=01052274071&from=01020077774&text=HELLOzzzzzz앙";
		
		System.out.println("APIURL : " + apiurl);;
		URL url = new URL(apiurl);
		HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
		
		httpURLConnection.setRequestMethod("POST");
		httpURLConnection.setDoOutput(true);
		httpURLConnection.setDoInput(true);
		httpURLConnection.connect();

		InputStream is   = null;
		ByteArrayOutputStream baos = null;
		String response;
		int responseCode = httpURLConnection.getResponseCode();
		 
		if(responseCode == HttpURLConnection.HTTP_OK) {
		 
		    is = httpURLConnection.getInputStream();
		    baos = new ByteArrayOutputStream();
		    byte[] byteBuffer = new byte[1024];
		    byte[] byteData = null;
		    int nLength = 0;
		    while((nLength = is.read(byteBuffer, 0, byteBuffer.length)) != -1) {
		        baos.write(byteBuffer, 0, nLength);
		    }
		    byteData = baos.toByteArray();
		    response = new String(byteData);
		    
		    System.out.println("RESPONSE : " + response);
		}
	}

}
