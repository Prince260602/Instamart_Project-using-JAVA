package Domain;

public class Discount {
	
Integer id;
Integer tenure;
Integer percentage;

public Discount(Integer id, Integer tenure, Integer percentage) {
	super();
	this.id = id;
	this.tenure = tenure;
	this.percentage = percentage;
}

public Discount(Integer tenure, Integer percentage) {
	super();
	this.tenure = tenure;
	this.percentage = percentage;
}

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getTenure() {
	return tenure;
}

public void setTenure(Integer tenure) {
	this.tenure = tenure;
}

public Integer getPercentage() {
	return percentage;
}

public void setPercentage(Integer percentage) {
	this.percentage = percentage;
}

}
