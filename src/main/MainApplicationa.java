package main;


import java.util.Scanner;

import pojo.Car;
import pojo.CarRentalSystems;
import pojo.Customer;

public class MainApplicationa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarRentalSystems crs = utility.Populate.populateRentalList();
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		int choise;

		do {
			System.out.println("\n **====== Enter the Choise =====** \n");
			System.out.println("1. Show Available Cars");
			System.out.println("2. Add Car");
			System.out.println("3. Add Customer");
			System.out.println("4. Rent the car");
			System.out.println("5. Show all Rented cars");
			System.out.println("6. Show all Customer");
			System.out.println("10. Exit");
			choise = sc.nextInt();

			switch (choise) {
			case 1: {
				System.out.println("Following are the available cars: \n");
				crs.showAllAvailableCars();
				break;
			}
			case 2: {
				System.out.println("Welcome to add new car, add following details one by one \n");
				System.out.println("Enter String carId");
				String id = sc.next();
				System.out.println("String brand");
				String brand = sc.next();
				System.out.println(" String model");
				String model = sc.next();
				System.out.println("double rentPerDay");
				double rentperday = sc.nextDouble();

				Car tobeadded = new Car(id, brand, model, rentperday, true);
				crs.addCar(tobeadded);
				System.out.println("Successful");
				break;
			}
			case 3: {
				System.out.println("Welcome to add new customer, add following details one by one \n");
				System.out.println("Enter String customerID");
				String id=sc.next();
				System.out.println("Enter String String name");
				String name=sc.next();
				
				Customer custtobeadded=new Customer(id, name);
				crs.addCustomer(custtobeadded);
				System.out.println("Successful");

			}
			case 4: {
			}
			case 5: {
				crs.ShowAllRentedCars();
				break;
			}
			case 6: {
				crs.showAllcustomers();
				break;
			}
			case 10: {
				System.out.println("Thank you.....");
				exit = true;
			}

			}

		} while (!exit);

//		sc.close();
	}

}
