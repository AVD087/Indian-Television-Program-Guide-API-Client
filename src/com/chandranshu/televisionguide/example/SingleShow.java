package com.chandranshu.televisionguide.example;


import java.util.LinkedHashMap;


public class SingleShow {

	private String showTitle;
	private String showTime;
	private String showThumb;

	private LinkedHashMap<String,String> showDetails;

	public SingleShow(String title, String time, String thumb) {

	}

	public String getShowTitle() {
		return showTitle;
	}

	public void setShowTitle(String showTitle) {
		this.showTitle = showTitle;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public LinkedHashMap<String, String> getShowDetails() {
		return showDetails;
	}

	public void setShowDetails(LinkedHashMap<String, String> showDetails) {
		this.showDetails = showDetails;
	}

	public String getShowThumb() {
		return showThumb;
	}

	public void setShowThumb(String showThumb) {
		this.showThumb = showThumb;
	}
}
