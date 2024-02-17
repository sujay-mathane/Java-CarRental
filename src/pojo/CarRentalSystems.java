package pojo;

import java.util.ArrayList;
import java.util.List;

public class CarRentalSystems {
	private List<Car> carsList;
	private List<Customer> customerList;
	private List<Rental> rentalList;

	public CarRentalSystems() {
		super();
		carsList = new ArrayList<>();
		customerList = new ArrayList<>();
		rentalList = new ArrayList<>();
	}

	public void addCar(Car carToBeAdded) {
		carsList.add(carToBeAdded);
//		System.out.println(carToBeAdded.getModel() + " Car added successfully");
	}

	public void addCustomer(Customer customerToBeAdded) {
		customerList.add(customerToBeAdded);
//		System.out.println(customerToBeAdded.getName() + " Customer added successfully");
	}

	public void rentTheCar(Car car, Customer customer, int days) {

		if (car.isAvailable() == false) {
			System.out.println("Car is not available for to be rented");
			return;
		}
		car.rent();
		rentalList.add(new Rental(car, customer, days));
//		System.out.println(car.getModel() + " Rented successfully to " + customer.getName()
//				+ " And total charges are: Rs." + car.calculatePrice(days) + "/-");
	}

	public void returnTheCar(Car car) {
		if (car.isAvailable()) {
			System.out.println("This " + car.getModel() + " Car is not rented");
		}

		Rental itemTobeRemoved = null;

		for (Rental r : rentalList) {
			if (r.getCar() == car) {
				itemTobeRemoved = r;
				break;
			}
			car.returnCar();
			rentalList.remove(itemTobeRemoved);
		}
	}
	
	public void ShowAllRentedCars() {
		for(Rental r: rentalList) {
			
			System.out.println(r.getCustomer().getName() +" has Rented "+r.getCar().getBrand()+" "+
			r.getCar().getModel() + " for " +r.getDays()+" days " + " And total charges are: Rs." + r.getCar().calculatePrice(r.getDays()) + "/-");
			
			System.out.println();
		}
	}

	public List<Car> getCarsList() {
		return carsList;
	}
	
	
	public void showAllAvailableCars() {
		Car tempcar = null;
		
		for(Car c: carsList) {
			 if(c.isAvailable()) {
				 tempcar=c;
				System.out.println(c.toString());
			 }
		}
		
		if(tempcar==null) {
			System.out.println("We dont have any car available ");
		}
	}
	
	public void showAllcustomers() {
		Customer temp=null;
		for(Customer c: customerList) {
			temp=c;
			System.out.println(c.toString());
			
		}
		if(temp==null) {
			System.out.println("Customer record is empty");
		}
	}
	

}
