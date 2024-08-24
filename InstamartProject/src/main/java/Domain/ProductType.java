package Domain;

public class ProductType {
	Integer id;
	String type;
	ProductCategory productCategory;
	
	

	public ProductType(Integer id, String type, ProductCategory productCategory) {
		super();
		this.id = id;
		this.type = type;
		this.productCategory = productCategory;
	}

	public ProductType() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}	
}
