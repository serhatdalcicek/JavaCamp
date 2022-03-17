package business.abstracts;

import dataAccess.abstracts.IHibernateUserDao;
import entities.concretes.User;

public class BaseUserManager implements IUserService {
	IUserValidationService userValidation;
	IHibernateUserDao userDao;
	IUserVerificationService userVerification;// kullanıcı doğrulama

	public BaseUserManager(IUserValidationService userValidation, IHibernateUserDao userDao,
			IUserVerificationService userVerification) {

		this.userValidation = userValidation;
		this.userDao = userDao;
		this.userVerification = userVerification;
	}

	@Override
	public void register(User user) { // kayıt olma
		if (userValidation.allCheck(user, userDao.getAll())) {
			userVerification.sendToVerifyMail(user);
		} else {
			System.out.println("Kayıt olunamadı ... :( ");
		}
	}

	@Override
	public void login(String email, String password) {
		if (userVerification.checkVerifyAccount(email)) {
			User searchUser = userDao.get(email);
			if (searchUser.getEmail() == email && searchUser.getPassword() == password) { // email ve şifreni kontrol
																							// eder
				System.out.println("Giriş yapıldı ... :) ");
			} else {
				System.out.println("Mail veya şifren yanlış kardeşim dikkatli olsana !");
			}

		} else {
			System.out.println("Sana dikkat et demiştim bak şimdi hesap doğrulanmadığı için giriş yapılamadı ... :/");
		}
	}

	@Override
	public void verifyAccount(User user) { // kullanıcı doğrulama mailine tıklamış gibi yaptık
		
		if (userVerification.verifyMail(user.getEmail())) {
			userDao.add(user);
		}
	}
}
