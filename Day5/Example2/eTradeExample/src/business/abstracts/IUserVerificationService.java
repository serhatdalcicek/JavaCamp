package business.abstracts;

import entities.concretes.User;

public interface IUserVerificationService {
	void sendToVerifyMail(User user); // doğrulama maili gönder

	boolean verifyMail(String email); // email adresini doğrula

	boolean checkVerifyAccount(String email); // doğru e mail adresi
}
