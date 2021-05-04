package racingcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RacingGame {
    private List<RacingCar> racingCarList;

    public RacingGame(List<String> nameList) {
        this.racingCarList = mapToList(nameList);
    }

    public List<RacingCar> getRacingCarList() {
        return racingCarList;
    }

    public ArrayList<RacingCar> mapToList(List<String> nameList) {
        ArrayList<RacingCar> racingCarList = new ArrayList<>();
        for (String name : nameList) {
            racingCarList.add(new RacingCar(name));
        }
        return racingCarList;
    }

    public void play(int move) {
        for (int i = 0; i < move; i++) {
            result();
        }
    }

    public void play(int move, List<Integer> numbers) {
        for (int i = 0; i < move; i++) {
            result(i * racingCarList.size(), numbers);
        }
    }

    private void result() {
        for (RacingCar racingCar : racingCarList) {
            racingCar.play();
        }
    }

    public void result(int index, List<Integer> numbers) {
        for (int j = 0; j < racingCarList.size(); j++) {
            racingCarList.get(j).play(numbers.get(index + j));
        }
    }

    public List<String> getWinner() {
        Collections.sort(racingCarList);

        List<String> winnerList = new ArrayList<>();
        int maxCount = racingCarList.get(0).getCountOfGo();
        String addString = racingCarList.get(0).getName();
        int i = 0;

        do {
            winnerList.add(addString);
            addString = checkCoWin(maxCount, racingCarList.get(++i));
        } while (i < (racingCarList.size() - 1) && addString.length() > 0);

        if (!addString.isEmpty()) {
            winnerList.add(addString);
        }

        return winnerList;
    }

    public String checkCoWin(int maxCount, RacingCar compareRacingCar) {
        if (maxCount == compareRacingCar.getCountOfGo()) {
            return compareRacingCar.getName();
        }
        return "";
    }
}
