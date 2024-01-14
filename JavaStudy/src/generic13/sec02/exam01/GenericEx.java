package generic13.sec02.exam01;

public class GenericEx {
	public static void main(String[] args) {
		
		Product<Tv, String> pro1 = new Product<Tv, String>();
		
		pro1.setKind(new Tv());
		pro1.setModel("스마트Tv");
		
		Tv tv = pro1.getKind();
		String tvModel = pro1.getModel();
		
		Product<Car, String> pro2 = new Product<Car, String>();
		
		pro2.setKind(new Car());
		pro2.setModel("SUV");
		
		Car car = pro2.getKind();
		String carModel = pro2.getModel();
	}
}
