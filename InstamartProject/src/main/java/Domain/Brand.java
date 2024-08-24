package Domain;

public class Brand {
	Integer id;
	String name;
	
	public Brand(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Brand() {
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
