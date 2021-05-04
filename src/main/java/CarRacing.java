import java.util.Scanner;

public class CarRacing {

	private static int COUNT = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("경주할 자동차 이름이르 입력하세요.(이름은 쉼표(,) 기준으로 구분");
		Cars cars = makeCars(scanner.nextLine());
		System.out.println("시도할 회수는 몇회인가요?");
		COUNT = scanner.nextInt();
		System.out.println("실행결과");

		for (int i = 0; i < COUNT; i++) {
			for (Car car : cars.getCars()) {
				car.move();
				System.out.println(car.name + ":" + printPosition(car.position));
			}
			System.out.println("");
		}

		Cars winnerCars = getWinners(cars);
		for (Car car : winnerCars.getCars()){
			System.out.print(car.name);
		}

		System.out.print("가 최종 우승했습니다.");
	}

	public static Cars makeCars(String carNames) {
		return new Cars(carNames);
	}

	public static String printPosition(int position) {
		StringBuffer printLine = new StringBuffer();
		for (int i = 0; i < position; i++) {
			printLine.append("-");
		}
		return printLine.toString();
	}

	public static Cars getWinners(Cars cars) {
		Cars winnerCars = new Cars();
		Car winnerCar = new Car();
		for (Car car : cars.getCars()){
			if(winnerCar.position < car.position){
				winnerCar = car;
			}
		}

		winnerCars.addCar(winnerCar);

		for (Car car : cars.getCars()){
			if(winnerCar.position == car.position){
				winnerCars.addCar(winnerCar);
			}
		}
		return winnerCars;
	}
}
