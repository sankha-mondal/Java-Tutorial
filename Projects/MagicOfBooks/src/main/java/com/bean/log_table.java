package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class log_table {
	@Id
	private String event_time;
	private String user_host;
	private String thread_id;
	private String server_id;
	private String command_type;
	private String argument;
	
	public String getEvent_time() {
		return event_time;
	}
	public void setEvent_time(String event_time) {
		this.event_time = event_time;
	}
	public String getUser_host() {
		return user_host;
	}
	public void setUser_host(String user_host) {
		this.user_host = user_host;
	}
	public String getThread_id() {
		return thread_id;
	}
	public void setThread_id(String thread_id) {
		this.thread_id = thread_id;
	}
	public String getServer_id() {
		return server_id;
	}
	public void setServer_id(String server_id) {
		this.server_id = server_id;
	}
	public String getCommand_type() {
		return command_type;
	}
	public void setCommand_type(String command_type) {
		this.command_type = command_type;
	}
	public String getArgument() {
		return argument;
	}
	public void setArgument(String argument) {
		this.argument = argument;
	}
	@Override
	public String toString() {
		return "log_table [event_time=" + event_time + ", user_host=" + user_host + ", thread_id=" + thread_id
				+ ", server_id=" + server_id + ", command_type=" + command_type + ", argument=" + argument + "]";
	}
	public log_table(String event_time, String user_host, String thread_id, String server_id, String command_type,
			String argument) {
		super();
		this.event_time = event_time;
		this.user_host = user_host;
		this.thread_id = thread_id;
		this.server_id = server_id;
		this.command_type = command_type;
		this.argument = argument;
	}
	public log_table() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
