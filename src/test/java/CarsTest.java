import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarsTest {
	@Test
	void 자동차_목록을_생성한다() {
		String carNames = "test1,test2,test3";
		int makeToCars = 3;
		Cars cars = new Cars(carNames);
		assertThat(cars.carsNumber()).isEqualTo(makeToCars);
	}
}