package com.ssm.Po;
public class User {
   private String username;
   private String password;
   private int id;
   private int age;
   private String truename;
@Override
public String toString() {
	return "User [username=" + username + ", password=" + password + ", id=" + id + ", age=" + age + ", truename="
			+ truename + "]";
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getTruename() {
	return truename;
}
public void setTruename(String truename) {
	this.truename = truename;
}
}
