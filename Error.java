package com.test;

import java.util.Date;

public class Error {
	private String message;
	private String path;
	private Date date;

	public Error(String message, String path, Date date) {
		super();
		this.message = message;
		this.path = path;
		this.date = date;
	}

	public Error() {
	}

	@Override
	public String toString() {
		return "Error [message=" + message + ", path=" + path + ", date=" + date + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
