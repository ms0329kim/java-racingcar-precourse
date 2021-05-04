import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Cars {
	public static List cars = new ArrayList();
	public Cars(String carNames) {
		List tempCarName = Arrays.asList(carNames.split(","));

		int bound = tempCarName.size();
		for (int i = 0; i < bound; i++) {
			cars.add(new Car(tempCarName.get(i).toString(), 0 ));
		}
	}

	public int carsNumber() {
		return cars.size();
	}
}
