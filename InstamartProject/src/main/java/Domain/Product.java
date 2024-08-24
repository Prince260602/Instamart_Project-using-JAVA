package Domain;

public class Product {
	Integer id;
	String name;
	Brand brand;
	ProductType productType;
	ProductCategory productCategory;
	CatalogServiceSector catalogServiceSector;
	CatalogServiceArea catalogServiceArea;
	String color;
	Material material;
	String dimensions;
	Boolean isVisible;
	Boolean isAvailable;
	String city;
	String imageUrl;


	  public Product(Integer id, String name, Brand brand, ProductType productType, ProductCategory productCategory,
				CatalogServiceSector catalogServiceSector, CatalogServiceArea catalogServiceArea, String color,
				Material material, String dimensions, Boolean isVisible, Boolean isAvailable,
				String city, String imageUrl) {
			super();
			this.id = id;
			this.name = name;
			this.brand = brand;
			this.productType = productType;
			this.productCategory = productCategory;
			this.catalogServiceSector = catalogServiceSector;
			this.catalogServiceArea = catalogServiceArea;
			this.color = color;
			this.material = material;
			this.dimensions = dimensions;
			this.isVisible = isVisible;
			this.isAvailable = isAvailable;
			this.city = city;
			this.imageUrl = imageUrl;
		}
	        
	public Product() {
		super();
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

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
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
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}
	public CatalogServiceSector getCatalogServiceSector() {
		return catalogServiceSector;
	}

	public void setCatalogServiceSector(CatalogServiceSector catalogServiceSector) {
		this.catalogServiceSector = catalogServiceSector;
	}

	public CatalogServiceArea getCatalogServiceArea() {
		return catalogServiceArea;
	}

	public void setCatalogServiceArea(CatalogServiceArea catalogServiceArea) {
		this.catalogServiceArea = catalogServiceArea;
	}
	
	
}
