package utility;


import pojo.Car;
import pojo.CarRentalSystems;
import pojo.Customer;

public class Populate {

	public static CarRentalSystems populateRentalList() {
		
		CarRentalSystems crs= new CarRentalSystems();
		
		Car city=new Car("C001", "Honda", "City", 1500, true);
		Car verna=new Car("C002", "Hyundai", "Verna", 1400, true);
		Car virtus=new Car("C003", "Woksvagen", "Virtus", 1550, true);
		Car slavia=new Car("C004", "Skoda", "Slavia", 1450, true);
		Car amaze=new Car("C005", "Honda", "Amaze", 1100, true);
		Car desire=new Car("C006", "Suzuki", "Desire", 1000, true);
		Car xcent=new Car("C007", "HYUNDAI", "Xcent", 1050, true);
		Car seltos=new Car("C008", "Kia", "Seltos", 1400, true);
		Car safari=new Car("C009", "Tata", "Safari", 1700, true);
		Car innova=new Car("C0010", "Toyota", "Innova", 1900, true);
		
		
		crs.addCar(city);
		crs.addCar(verna);
		crs.addCar(virtus);
		crs.addCar(slavia);
		crs.addCar(amaze);
		crs.addCar(desire);
		crs.addCar(xcent);
		crs.addCar(seltos);
		crs.addCar(innova);
		crs.addCar(safari);
		
		
		Customer rushabh=new Customer("U001", "Rushabh");
		Customer mohak=new Customer("U002", "Mohak");
		Customer prathamesh=new Customer("U003", "Prathamesh");
		Customer chinmay=new Customer("U004", "Chinmay");
		Customer abhiram=new Customer("U005", "Abhiram");
		Customer mahendra=new Customer("U006", "Mahendra");
		
		crs.addCustomer(mahendra);
		crs.addCustomer(abhiram);
		crs.addCustomer(chinmay);
		crs.addCustomer(mohak);
		crs.addCustomer(prathamesh);
		crs.addCustomer(rushabh);
		
		
		crs.rentTheCar(desire, mahendra, 5);
		crs.rentTheCar(amaze, abhiram, 7);
		crs.rentTheCar(slavia, chinmay, 4);
		crs.rentTheCar(virtus, prathamesh, 6);
		crs.rentTheCar(verna, mohak, 5);
		crs.rentTheCar(city, rushabh, 10);
	
		return crs;
	}
}
