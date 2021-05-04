import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ValidationUtilsTest {
	@Test
	void 다섯자_이하_이름_검증() {
		boolean validatedResult = ValidationUtils.validName("test");
		assertThat(validatedResult).isTrue();
	}
	@Test
	void 다섯자_초과_이름검증() {
		boolean validatedResult = ValidationUtils.validName("testtest");
		assertThat(validatedResult).isFalse();
	}
}
