public class CarApplication {
	
	public static void main(String[] args) {

		Car car1 = new Car("Ford", 5, "Manual", "120");
		System.out.println(car1.showState());
		System.out.println(car1.accelerate());

		Car car2= new Car ("nissan", 6, "Automática", "180");
		System.out.println(car2.showState());

		SmallCar mini = new SmallCar(2);
		System.out.println(mini.showState());
		System.out.println(mini.accelerate());
		System.out.println(mini.seatsNumber());
	}
}