package business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.IUserValidationService;
import entities.concretes.User;

public class UserValidationManager implements IUserValidationService {

	@Override
	public boolean checkEmailFormat(User user) {
		String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z.-]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		if (matcher.matches()) {
			return true;
		}
		System.out.println("Harika! geçerli bir E-Mail girdin dostum :)");
		return false;
	}

	public boolean checkEmailDuplicate(User user, List<User> userList) {
		for (User value : userList) {
			if (user.getEmail() == value.getEmail()) {
				System.out.println("Bu email daha önce kullanılmış beni kandıramazsın  :/ ");
			return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkPassword(User user) {
        if (user.getPassword().length() >= 6) {
        return true ;	
        }  
		System.out.println("Şifren 6 karakterden az olamaz dostum!");
		return false;
	}

	@Override
	public boolean checkFirstName(User user) {
        if (user.getFirstName().length() >1) {
        return true;	
        }
        System.out.println("İsmin 2 karakterden nasıl az olabilir ki dostum ?");
		return false;
	}

	@Override
	public boolean checkLastName(User user) {
		if (user.getLastName().length() >2 ) {
		return true;	
		}
		System.out.println("Soyadın 2 karakterden nasıl az olabilir ki dostum )");
		return false;
	}

	@Override
	public boolean allCheck(User user, List<User> userList) {
		
		return checkEmailFormat(user)
				&& checkEmailDuplicate(user, userList)
				&& checkPassword(user)
				&& checkFirstName(user)
				&& checkLastName(user);
	}

	@Override
	public boolean checkEmailDuplicate(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
