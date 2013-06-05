package com.chandranshu.televisionguide.example;


import java.util.Vector;

public class JSONEntity {

	private String date;
	private String channelName;
	
	private Vector<SingleShow> listOfShows;
	
	public JSONEntity() {
		listOfShows = new Vector<SingleShow>();
	}
	
	
	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getChannelName() {
		return channelName;
	}


	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}


	public Vector<SingleShow> getListOfShows() {
		return listOfShows;
	}


	public void setListOfShows(Vector<SingleShow> listOfShows) {
		this.listOfShows = listOfShows;
	}

}
