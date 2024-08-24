package Domain;

public class ProductCategory {
	Integer id;
	String category;
	CatalogServiceArea catalogServiceArea;
	
	public ProductCategory(Integer id, String category, CatalogServiceArea catalogServiceArea) {
		super();
		this.id = id;
		this.category = category;
		this.catalogServiceArea = catalogServiceArea;
	}

	public ProductCategory() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public CatalogServiceArea getCatalogServiceArea() {
		return catalogServiceArea;
	}

	public void setCatalogServiceArea(CatalogServiceArea catalogServiceArea) {
		this.catalogServiceArea = catalogServiceArea;
	}	
	
	
}
