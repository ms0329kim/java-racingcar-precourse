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
            System.out.println();
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
            System.out.println(racingCar.toString());
        }
    }

    public void result(int index, List<Integer> numbers) {
        for (int j = 0; j < racingCarList.size(); j++) {
            racingCarList.get(j).play(numbers.get(index + j));
        }
    }

    public List<String> getWinner() {
        if (racingCarList.size() == 1) {
            return getWinnerInParticipant();
        }

        return getWinnerInParticipants();
    }

    private List<String> getWinnerInParticipant() {
        List<String> winners = new ArrayList<>();
        winners.add(racingCarList.get(0).getName());
        return winners;
    }

    private List<String> getWinnerInParticipants() {
        Collections.sort(racingCarList);
        List<String> winners = new ArrayList<>();

        int maxCount = racingCarList.get(0).getCountOfGo();
        String addString;
        int i = 0;

        do {
            addString = checkCoWin(maxCount, racingCarList.get(i++));
            addWinner(winners, addString);
        } while (addString.length() > 0 && i < racingCarList.size());

        return winners;
    }

    private void addWinner(List<String> winners, String addString) {
        if (addString.length() > 0) {
            winners.add(addString);
        }
    }

    public String checkCoWin(int maxCount, RacingCar compareRacingCar) {
        if (maxCount == compareRacingCar.getCountOfGo()) {
            return compareRacingCar.getName();
        }
        return "";
    }
}
