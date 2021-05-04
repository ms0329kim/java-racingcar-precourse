import racingcar.RacingGame;
import utils.StringUtils;
import utils.ValidationUtils;

import java.util.List;
import java.util.Scanner;

public class RacingGameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputNames = scanner.nextLine();
        List<String> splitNames = StringUtils.split(inputNames);

        for (int i = 0; i < splitNames.size(); i++) {
            if (!ValidationUtils.validName(splitNames.get(i))) {
                System.out.println("조건이 틀렸습니다. 게임을 종료합니다.");
                return;
            }
        }

        System.out.println("시도할 회수는 몇회인가요?");
        int move = scanner.nextInt();

        System.out.println("\n실행결과");
        RacingGame racingGame = new RacingGame(splitNames);
        racingGame.play(move);

        System.out.println(String.join(", ", racingGame.getWinner()) + "가 최종 우승했습니다.");
    }
}
