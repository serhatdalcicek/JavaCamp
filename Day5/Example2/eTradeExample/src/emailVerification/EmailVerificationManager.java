package emailVerification;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import entities.concretes.User;

public class EmailVerificationManager {
	private Pattern pattern;
	private Matcher matcher;

	public boolean checkEmailFormat(User user) {
		String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z.-]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		if (matcher.matches()) {
			return true;
		}
		System.out.println("Geçerli bir email giriniz!");
		return false;
	}
}