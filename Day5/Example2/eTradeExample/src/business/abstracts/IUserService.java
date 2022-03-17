package business.abstracts;

import entities.concretes.User;

public interface IUserService {
	void register(User user); // kayıt olmak

	void login(String email, String password); // giriş yapmak

	void verifyAccount(User user); // doğru kullanıcı & hesap
}
