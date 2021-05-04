public class ValidationUtils {
	public static boolean validName(String carName) {
		if(carName.length() <= 5) {
			return true;
		}
		return false;
	}
}
