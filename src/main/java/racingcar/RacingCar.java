package racingcar;

public class RacingCar implements Comparable<RacingCar> {
    private final static int RACING_GO_VALUE = 3;

    private String name;
    private int countOfGo;

    public RacingCar(String name) {
        this.name = name;
        this.countOfGo = 0;
    }

    public void play(int number) {
        if (number > RACING_GO_VALUE) {
            countOfGo++;
        }
    }

    public String getName() {
        return name;
    }

    public int getCountOfGo() {
        return countOfGo;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.name);
        sb.append(" : ");

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
