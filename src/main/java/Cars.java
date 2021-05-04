import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Cars {
	public static List cars = new ArrayList();
	public Cars(String carNames) {
		List tempCarName = Arrays.asList(carNames.split(","));

		IntStream.range(0, tempCarName.size()).forEach(i -> cars.add(new Car(tempCarName.get(i).toString())));
	}

	public int carsNumber() {
		return cars.size();
	}
}
