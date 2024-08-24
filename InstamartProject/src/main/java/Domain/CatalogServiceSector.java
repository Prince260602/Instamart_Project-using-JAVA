package Domain;

public class CatalogServiceSector {
	Integer id;
	String name;

	public CatalogServiceSector(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public CatalogServiceSector() {
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
	
}
