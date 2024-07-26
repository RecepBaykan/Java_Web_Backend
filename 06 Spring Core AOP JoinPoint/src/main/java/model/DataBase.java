package model;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component ("dataBase")


public class DataBase {
	
	private String user;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	private String password;
	private String url;

}
