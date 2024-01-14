package generic13.sec02.exam02;

public class GenericEx {
	public static void main(String[] args) {
		HomeAgency home = new HomeAgency();
		Home homes = home.rent();
		homes.turnOn();
		
		CarAgency car = new CarAgency();
		Car cars = car.rent();
		cars.run();
	}
}
