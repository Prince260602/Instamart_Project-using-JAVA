package Domain;

import java.util.Date;
import java.util.List;

public class RentalPackage {
    private Integer id;
    private String name;
    private Boolean isVisible;
    private Boolean isAvailable;
    private String city;
    private Date createdDate;
    List<Product> productList;
    String imageUrl;
    public RentalPackage(Integer id, String name, Boolean isVisible, Boolean isAvailable, String city, String imageUrl, Date createdDate, List<Product> productList) {
        this.id = id;
        this.name = name;
        this.isVisible = isVisible;
        this.isAvailable = isAvailable;
        this.city = city;
        this.createdDate = createdDate;
        this.productList = productList;
        this.imageUrl = imageUrl;
    }
    
    public RentalPackage(Integer id, String name, Boolean isVisible, Boolean isAvailable, String city,String imageUrl, Date createdDate) {
        this.id = id;
        this.name = name;
        this.isVisible = isVisible;
        this.isAvailable = isAvailable;
        this.city = city;
        this.createdDate = createdDate;
        this.imageUrl = imageUrl;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getCreatedDate() {
        return createdDate;
    }
    public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    
    
}
