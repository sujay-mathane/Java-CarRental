package pojo;

public class Car {
	private String carId;
	private String brand;
	private String model;
	private double rentPerDay;
	private boolean isAvailable=true;
	
	
	public Car(String carId, String brand, String model, double rentPerDay, boolean isAvailable) {
		super();
		this.carId = carId;
		this.brand = brand;
		this.model = model;
		this.rentPerDay = rentPerDay;
		this.isAvailable = isAvailable;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public double getRentPerDay() {
		return rentPerDay;
	}


	public void setRentPerDay(double rentPerDay) {
		this.rentPerDay = rentPerDay;
	}


	public boolean isAvailable() {
		return isAvailable;
	}


	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


	public String getCarId() {
		return carId;
	}
	
	public void rent() {
		setAvailable(false);
	}
	
	public void returnCar() {
		setAvailable(true);
	}
	
	public double calculatePrice(int days) {
		return this.rentPerDay*days;
	}


	@Override
	public String toString() {
		return "Car [carId=" + carId + ", brand=" + brand + ", model=" + model + ", rentPerDay=" + rentPerDay
				+ ", isAvailable=" + isAvailable + "]";
	}
	
	
	
}
