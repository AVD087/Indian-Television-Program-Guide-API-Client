package com.chandranshu.televisionguide.example;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.LinkedHashMap;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {

		String baseURL = "http://indian-television-guide.appspot.com/indian_television_guide?";
		String channelName = "set-max";
		String date = "13032013"; 
		//(12-03-2013)Change it to a valid-date in the same format

		String completeURL = baseURL + "channel=" + channelName + "&date=" + date;

		try {
			URL url = new URL(completeURL);
			InputStream is = url.openStream();  // throws an IOException
			DataInputStream dis = new DataInputStream(new BufferedInputStream(is));

			String line = new String();
			String jsonData = new String();

			while ((line = dis.readLine()) != null) {
				System.out.println(line);
				jsonData = jsonData + line;
			}

			Gson gson = new Gson();
			JSONEntity programJSON = gson.fromJson(jsonData, JSONEntity.class);

			//Now after getting JSONEntity, you can use the data in whichever way you like.
			int showIndex = 6;
			LinkedHashMap<String, String> sd = programJSON.getListOfShows().get(showIndex).getShowDetails();
			System.out.println(sd.get("Genre:"));

		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}
