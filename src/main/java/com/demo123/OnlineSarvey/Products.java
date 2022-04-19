package com.demo123.OnlineSarvey;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
@Id
int pid;
String pname;
int pcost;
public Products() {
	
}
public Products(int pid, String pname, int pcost) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pcost = pcost;
	
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPcost() {
	return pcost;
}
public void setPcost(int pcost) {
	this.pcost = pcost;
}
@Override
public String toString() {
	return "Products [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + "]";
}


}
