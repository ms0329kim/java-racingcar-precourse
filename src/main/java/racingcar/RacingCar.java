package racingcar;

import utils.NumberUtils;
import utils.ValidationUtils;

public class RacingCar implements Comparable<RacingCar> {
    private final static int RACING_GO_VALUE = 3;

    private String name;
    private int countOfGo;

    public RacingCar(String name) {
        this.name = name;
        this.countOfGo = 0;
    }

    public String getName() {
        return name;
    }

    public int getCountOfGo() {
        return countOfGo;
    }

    public void play() {
        int randomNumber = NumberUtils.randomNumber();
        while (!ValidationUtils.validNumber(randomNumber)) {
            randomNumber = NumberUtils.randomNumber();
        }

        if (randomNumber > RACING_GO_VALUE) {
            countOfGo++;
        }
    }

    public void play(int number) {
        if (number > RACING_GO_VALUE) {
            countOfGo++;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(" : ");

        if (countOfGo == 0) {
            return sb.toString();
        }

        for (int i = 0; i < countOfGo; i++) {
            sb.append("-");
        }

        return sb.toString();
    }

    @Override
    public int compareTo(RacingCar racingCar) {
        if (this.countOfGo < racingCar.getCountOfGo()) {
            return 1;
        }

        if (this.countOfGo > racingCar.getCountOfGo()) {
            return -1;
        }

        return 0;
    }
}
