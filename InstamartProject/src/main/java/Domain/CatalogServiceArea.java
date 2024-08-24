package Domain;

public class CatalogServiceArea {
	Integer id;
	String category;
	CatalogServiceSector catalogServiceSector;
	
	public CatalogServiceArea(Integer id, String category, CatalogServiceSector catalogServiceSector) {
		super();
		this.id = id;
		this.category = category;
		this.catalogServiceSector = catalogServiceSector;
	}

	public CatalogServiceArea() {
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

	public CatalogServiceSector getCatalogServiceSector() {
		return catalogServiceSector;
	}

	public void setCatalogServiceSector(CatalogServiceSector catalogServiceSector) {
		this.catalogServiceSector = catalogServiceSector;
	}
	
	
}
