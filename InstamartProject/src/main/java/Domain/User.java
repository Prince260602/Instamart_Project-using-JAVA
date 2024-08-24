package Domain;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class User {
	private Integer id;
	private String firstName;
	private String lastName;
	private Date dob;
	private Integer age;
	private String contactNo;
	private String email;
	private String username;
	private String password;
	private Role role;
	private ArrayList<Address> addressList;
	
	public User(Integer id, String firstName, String lastName, Date dob, int age, String contactNo, String email,
			String username, String password, Role role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.age = age;
		this.contactNo = contactNo;
		this.email = email;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	public User(Integer id, String firstName, String lastName, Date dob,
			Integer age, String contactNo, String email, String username,
			String password, Role role, ArrayList<Address> addressList) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.age = age;
		this.contactNo = contactNo;
		this.email = email;
		this.username = username;
		this.password = password;
		this.role = role;
		this.addressList = addressList;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}		
	public ArrayList<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(ArrayList<Address> addressList) {
		this.addressList = addressList;
	}
	
//	public String toString(){
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//		return String.format("%-15s %-15s %-15s %-15s %-15s %-15s %s",this.getFirstName(),this.getLastName(),this.getEmail(),this.getUsername(),sdf.format(this.getDob()),this.getAge(),this.getContactNo());
//	}
}
