public class Car {
	public String name;

	public Car(String carName) {
		if(ValidationUtils.validName(carName)) {
			this.name = carName;
		}
	}
}
