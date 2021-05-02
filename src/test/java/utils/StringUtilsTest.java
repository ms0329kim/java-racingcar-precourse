package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilsTest {

    @Test
    @DisplayName("쉼표_기준_분리")
    void 쉼표_기준_분리() {
        ArrayList<String> expected = new ArrayList<>();
        List<String> actual = StringUtils.split("");
        assertThat(actual.size()).isEqualTo(0);

        expected = new ArrayList<>();
        expected.add("aaa");
        expected.add("bbb");
        expected.add("ccc");

        actual = StringUtils.split("aaa,bbb,ccc");
        for (int i = 0; i < expected.size(); i++) {
            assertThat(actual.get(i)).isEqualTo(expected.get(i));
        }
    }
}
