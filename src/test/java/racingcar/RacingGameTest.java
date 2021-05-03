package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    List<String> expected;
    int move;

    @BeforeEach
    void setUp() {
        expected = new ArrayList<>();
        expected.add("aaa");
        expected.add("bbb");
        expected.add("ccc");
    }

    @Test
    @DisplayName("게임_진행_결과")
    void 게임_진행_결과() {
        RacingGame racingGame = new RacingGame(expected);
        move = 3;

        racingGame.play(move, Arrays.asList(1, 2, 4, 2, 4, 6, 4, 7, 8));
        List<RacingCar> actual = racingGame.getRacingCarList();
        assertThat(actual.get(0).toString()).isEqualTo("aaa : -");
        assertThat(actual.get(1).toString()).isEqualTo("bbb : --");
        assertThat(actual.get(2).toString()).isEqualTo("ccc : ---");
    }

    @Test
    @DisplayName("게임_진행_우승자1")
    void 게임_진행_우승자1() {
        RacingGame racingGame = new RacingGame(expected);
        move = 4;

        racingGame.play(move, Arrays.asList(1, 2, 4, 2, 4, 6, 4, 7, 8, 3, 5, 9));
        racingGame.getRacingCarList();
        List<String> actual = racingGame.getWinner();

        assertThat(String.join(", ", actual)).isEqualTo("ccc");
    }

    @Test
    @DisplayName("게임_진행_우승자2")
    void 게임_진행_우승자2() {
        RacingGame racingGame = new RacingGame(expected);
        move = 4;

        racingGame.play(move, Arrays.asList(1, 1, 1, 2, 2, 2, 3, 5, 5, 4, 6, 6));
        List<String> actual = racingGame.getWinner();

        assertThat(String.join(", ", actual)).isEqualTo("bbb, ccc");
    }

    @Test
    @DisplayName("게임_진행_우승자2_2")
    void 게임_진행_우승자2_2() {
        RacingGame racingGame = new RacingGame(expected);
        move = 3;

        racingGame.play(move, Arrays.asList(5, 0, 5, 6, 1, 6, 7, 3, 8));
        List<String> actual = racingGame.getWinner();

        assertThat(String.join(", ", actual)).isEqualTo("aaa, ccc");
    }

    @Test
    @DisplayName("게임_진행_우승자3")
    void 게임_진행_우승자3() {
        RacingGame racingGame = new RacingGame(expected);
        move = 3;

        racingGame.play(move, Arrays.asList(5, 5, 5, 5, 5, 5, 5, 5, 5));
        List<String> actual = racingGame.getWinner();

        assertThat(String.join(", ", actual)).isEqualTo("aaa, bbb, ccc");
    }

}
