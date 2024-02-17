package pojo;

public class Customer {

	private String customerID;
	private String name;
	
	
	public Customer(String customerID, String name) {
		super();
		this.customerID = customerID;
		this.name = name;
	}

	public String getCustomerID() {
		return customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", name=" + name + "]";
	}
	
	
	
}
