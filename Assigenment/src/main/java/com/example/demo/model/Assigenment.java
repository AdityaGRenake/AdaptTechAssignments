package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Assigenment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String productname;
	private double productprice;
	private int ItemNumber;
	private String modelnumber;
	private String productcategory;
	private String productdescription;
	private String productlink;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}
	public int getItemNumber() {
		return ItemNumber;
	}
	public void setItemNumber(int itemNumber) {
		ItemNumber = itemNumber;
	}
	public String getModelnumber() {
		return modelnumber;
	}
	public void setModelnumber(String modelnumber) {
		this.modelnumber = modelnumber;
	}
	public String getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}
	public String getProductdescription() {
		return productdescription;
	}
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}
	public String getProductlink() {
		return productlink;
	}
	public void setProductlink(String productlink) {
		this.productlink = productlink;
	}
	@Override
	public String toString() {
		return "Assigenment [id=" + id + ", productname=" + productname + ", productprice=" + productprice
				+ ", ItemNumber=" + ItemNumber + ", modelnumber=" + modelnumber + ", productcategory=" + productcategory
				+ ", productdescription=" + productdescription + ", productlink=" + productlink + "]";
	}
	
}
