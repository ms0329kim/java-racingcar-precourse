package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {

    @Test
    @DisplayName("이름_5자_이하")
    void 이름_5자_이하() {
        assertThat(ValidationUtils.validName("가나다라마바")).isFalse();
        assertThat(ValidationUtils.validName("가나다라마")).isTrue();
        assertThat(ValidationUtils.validName("abcdef")).isFalse();
        assertThat(ValidationUtils.validName("abcde")).isTrue();
        assertThat(ValidationUtils.validName("")).isFalse();
    }
}