package dmacc.beans;


public class Contact {
	private long id;
	private String name;
	private String phone;
	private String relationship;
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Contact(String name) {
		super();
		this.name = name;
	}
	
	public Contact(String name, String phone, String relationship) {
		super();
		this.name = name;
		this.phone = phone;
		this.relationship = relationship;
	}

	public Contact(long id, String name, String phone, String relationship) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.relationship = relationship;
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", phone=" + phone + ", relationship=" + relationship + "]";
	}

}
