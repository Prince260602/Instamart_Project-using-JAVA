package Domain;

import java.util.Date;

public class ProductRate {
	Integer id;
	Product product;
	Integer rate;
	Date startDate;
	Date endDate;
	
	public ProductRate(Integer id, Product product, Integer rate, Date startDate, Date endDate) {
		super();
		this.id = id;
		this.product = product;
		this.rate = rate;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public ProductRate() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
}
