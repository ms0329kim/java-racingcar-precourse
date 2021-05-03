package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarTest {

    RacingCar expected;

    @BeforeEach
    void setUp() {
        expected = new RacingCar("aaaaa");
    }

    @Test
    @DisplayName("play_pause")
    void play_pause() {
        expected.play(3);
        assertThat(expected.toString()).isEqualTo("aaaaa : ");
    }

    @Test
    @DisplayName("play_go")
    void play_go() {
        expected.play(6);
        assertThat(expected.toString()).isEqualTo("aaaaa : -");
    }

    @Test
    @DisplayName("play_1go_1pause")
    void play_1go_1pause() {
        expected.play(4);
        expected.play(2);
        assertThat(expected.toString()).isEqualTo("aaaaa : -");
    }

    @Test
    @DisplayName("play_3go")
    void play_3go() {
        expected.play(4);
        expected.play(7);
        expected.play(8);
        assertThat(expected.toString()).isEqualTo("aaaaa : ---");
    }
}
