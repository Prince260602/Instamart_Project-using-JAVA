package Domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RentalAgreement {
	Long id;
	String agreementNumber;
	Company company;
	OrderDetail orderDetail;
	Integer tenure;
	Date bookedDate;
	Date deliveryDate;
	Date renewalDate;
	Date expiryDate;
	Discount discount;
	Integer totalCost;
	
	public RentalAgreement(Long id, String agreementNumber,Company company, OrderDetail orderDetail,
			Integer tenure, Date bookedDate, Date deliveryDate,
			Date renewalDate, Date expiryDate, Discount discount,
			Integer totalCost) {
		super();
		this.id = id;
		this.agreementNumber = agreementNumber;
		this.company = company;
		this.orderDetail = orderDetail;
		this.tenure = tenure;
		this.bookedDate = bookedDate;
		this.deliveryDate = deliveryDate;
		this.renewalDate = renewalDate;
		this.expiryDate = expiryDate;
		this.discount = discount;
		this.totalCost = totalCost;
	}
	
	public RentalAgreement(String agreementNumber,Company company, OrderDetail orderDetail, Integer tenure,
			Date bookedDate, Date deliveryDate, Date renewalDate,
			Date expiryDate, Discount discount, Integer totalCost) {
		super();
		this.agreementNumber = agreementNumber;
		this.company = company;
		this.orderDetail = orderDetail;
		this.tenure = tenure;
		this.bookedDate = bookedDate;
		this.deliveryDate = deliveryDate;
		this.renewalDate = renewalDate;
		this.expiryDate = expiryDate;
		this.discount = discount;
		this.totalCost = totalCost;
	}
	public RentalAgreement(){
		
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAgreementNumber() {
		return agreementNumber;
	}
	public void setAgreementNumber(String agreementNumber) {
		this.agreementNumber = agreementNumber;
	}
	public OrderDetail getOrderDetail() {
		return orderDetail;
	}
	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}
	public Integer getTenure() {
		return tenure;
	}
	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}
	public Date getBookedDate() {
		return bookedDate;
	}
	public void setBookedDate(Date bookedDate) {
		this.bookedDate = bookedDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Date getRenewalDate() {
		return renewalDate;
	}
	public void setRenewalDate(Date renewalDate) {
		this.renewalDate = renewalDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Discount getDiscount() {
		return discount;
	}
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	public Integer getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Integer totalCost) {
		this.totalCost = totalCost;
	}
	
	public String toString(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n", this.getAgreementNumber(),this.getOrderDetail().getId(),this.getTenure(),sdf.format(this.getBookedDate()),sdf.format(this.getDeliveryDate()),sdf.format(this.getRenewalDate()),sdf.format(this.getExpiryDate()),this.getDiscount().getPercentage(),this.getTotalCost() );
	}

}
