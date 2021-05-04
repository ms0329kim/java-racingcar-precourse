
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {

	@Test
	void 자동차_이름을_부여한다() {
		String carName = "test";
		Car car = new Car(carName);
		assertThat(car.name).isNotEmpty();
	}
}
