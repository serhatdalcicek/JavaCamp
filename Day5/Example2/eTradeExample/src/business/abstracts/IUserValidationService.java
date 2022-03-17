package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface IUserValidationService {
	
	boolean checkEmailFormat(User user); // Email formatını kontrol et demektir.

	boolean checkEmailDuplicate(User user); // Email kopyasını kontrol et demektir.

	boolean checkPassword(User user);

	boolean checkFirstName(User user);

	boolean checkLastName(User user);

	boolean allCheck(User user, List<User> userList);

	boolean checkEmailDuplicate(User user, List<User> userList);
}
