import java.util.Random;

public class Car {

	public String name;
	public int position;
	public int score;

	private static final int MIN_RANDOM_NUMBER = 1;
	private static final int MAX_RANDOM_NUMBER = 10;
	public static final int POSSIBLE_MOVE_SCORE = 4;

	public Car(String carName, int position) {
		if (ValidationUtils.validName(carName)) {
			this.name = carName;
			this.position = position;
		}
	}

	public Car() {

	}

	public void move() {
		if (movePossible())
			this.position++;
	}

	public int position() {
		return this.position;
	}

	public int getRandomNumber() {
		Random random = new Random();
		this.score = random.nextInt(MAX_RANDOM_NUMBER - MIN_RANDOM_NUMBER) + MIN_RANDOM_NUMBER;
		return this.score;
	}

	public boolean movePossible() {
		return getRandomNumber() >= POSSIBLE_MOVE_SCORE;
	}
}
