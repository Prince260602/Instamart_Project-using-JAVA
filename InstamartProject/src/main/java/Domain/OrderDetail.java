package Domain;

import java.util.ArrayList;
import java.util.Date;

public class OrderDetail {
	
Long id;
User user;
String name;
String contactNo;
Date orderedDate;
Date deliveryDate;
String deliveryTime;
Address address;
ArrayList<Product> productList;
ArrayList<RentalPackage> rentalPackageList;
Integer costPerMonth;

public OrderDetail(Long id, User user, String name, String contactNo,
		Date orderedDate, Date deliveryDate, String deliveryTime,
		Address address, ArrayList<Product> productList,
		ArrayList<RentalPackage> rentalPackageList, Integer costPerMonth) {
	super();
	this.id = id;
	this.user = user;
	this.name = name;
	this.contactNo = contactNo;
	this.orderedDate = orderedDate;
	this.deliveryDate = deliveryDate;
	this.deliveryTime = deliveryTime;
	this.address = address;
	this.productList = productList;
	this.rentalPackageList = rentalPackageList;
	this.costPerMonth = costPerMonth;
}


public OrderDetail( User user, String name, String contactNo,
		Date orderedDate, Date deliveryDate, String deliveryTime,
		Address address, ArrayList<Product> productList,
		ArrayList<RentalPackage> rentalPackageList, Integer costPerMonth) {
	super();
	this.user = user;
	this.name = name;
	this.contactNo = contactNo;
	this.orderedDate = orderedDate;
	this.deliveryDate = deliveryDate;
	this.deliveryTime = deliveryTime;
	this.address = address;
	this.productList = productList;
	this.rentalPackageList = rentalPackageList;
	this.costPerMonth = costPerMonth;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getContactNo() {
	return contactNo;
}

public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}

public Date getOrderedDate() {
	return orderedDate;
}

public void setOrderedDate(Date orderedDate) {
	this.orderedDate = orderedDate;
}

public Date getDeliveryDate() {
	return deliveryDate;
}

public void setDeliveryDate(Date deliveryDate) {
	this.deliveryDate = deliveryDate;
}

public String getDeliveryTime() {
	return deliveryTime;
}

public void setDeliveryTime(String deliveryTime) {
	this.deliveryTime = deliveryTime;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public ArrayList<Product> getProductList() {
	return productList;
}

public void setProductList(ArrayList<Product> productList) {
	this.productList = productList;
}

public ArrayList<RentalPackage> getRentalPackageList() {
	return rentalPackageList;
}

public void setRentalPackageList(ArrayList<RentalPackage> rentalPackageList) {
	this.rentalPackageList = rentalPackageList;
}

public Integer getCostPerMonth() {
	return costPerMonth;
}

public void setCostPerMonth(Integer costPerMonth) {
	this.costPerMonth = costPerMonth;
}



}

