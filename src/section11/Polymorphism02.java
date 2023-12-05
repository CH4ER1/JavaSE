package section11;

import section11.access1.Bus;
import section11.access1.Car;
import section11.access1.SchoolBus;

public class Polymorphism02 {

	// 1 car 2 bus 3 school bus
	public static void main(String[] args) {
		SchoolBus sBus = new SchoolBus();
		SchoolBus sBus2 = new SchoolBus();
		sBus.drive(); //3		
		System.out.println(System.identityHashCode(sBus));
		System.out.println(System.identityHashCode(sBus2));
		
		Car car = sBus; 
		car.drive(); //3
		System.out.println(System.identityHashCode(car));

		
		Bus bus = (Bus)car;
		bus.drive(); //3
		System.out.println(System.identityHashCode(bus));

		
	}
}
