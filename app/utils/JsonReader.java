package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import models.Bill;
import play.libs.Json;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author kli
 *
 * Class to read in from a JSON endpoint
 */
public class JsonReader {

	/**
	 * @param endPoint
	 * @return JsonNode being read from the Sky endpoint
	 * @throws IOException
	 */
	public static JsonNode read(String endPoint) throws IOException {
		InputStream in = null;
		try {
	
	        URL url = new URL(endPoint);
	        
	        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			connection.connect();
			in = connection.getInputStream();
		    BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"));
			StringBuilder content = new StringBuilder();
			int cp;
			while ((cp = br.read()) != -1) {
				content.append((char) cp);
			}
			JsonNode node = Json.parse(content.toString());
			return node;
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}
	
	/**
	 * @param billNode
	 * @return Bill object
	 * @throws IOException
	 */
	public static Bill convertJsonToBillByJsonNode(JsonNode billNode) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_DEFAULT);
		Bill bill = objectMapper.readValue(billNode.toString(), Bill.class);
		return bill;
	}
	
	/**
	 * @param endPoint
	 * @return Bill for the controllers and front end
	 * @throws IOException
	 */
	public static Bill convertJsonToBill(String endPoint) throws IOException {
		JsonNode billNode = read(endPoint);
		Bill bill = convertJsonToBillByJsonNode(billNode);
		return bill;
	}
}
