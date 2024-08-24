package Domain;

public class Role {
	private Integer id;
	private String name;
	private Boolean active;
	
	public Role(Integer id, String name, Boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.active = active;
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
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
}
