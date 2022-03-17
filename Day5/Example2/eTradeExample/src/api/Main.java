package api;

import business.abstracts.BaseUserManager;
import business.concretes.UserManager;
import business.concretes.UserValidationManager;
import business.concretes.UserVerificationManager;
import core.concretes.EmailLoginAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
       HibernateUserDao hibernateUserDao = new HibernateUserDao();
       UserValidationManager userValidationManager = new UserValidationManager();
       UserVerificationManager userVerificationManager = new UserVerificationManager();
       
       User user1 = new User(1, "Serhat", "Dalçiçek", "serhatdalcicek@gmail.com", "12345");
       User user2 = new User(2, "Serhat", "Dalçiçek", "serhatdalcicek@gmail.com", "12345");
       
       //email ile giriş
       BaseUserManager emailManager = new EmailLoginAdapter(userValidationManager,hibernateUserDao,userVerificationManager);
       
       //normal giriş
      BaseUserManager userManager2 = new UserManager(userValidationManager, hibernateUserDao, userVerificationManager); 
	
	emailManager.register(user2);
	
	
	}

}
