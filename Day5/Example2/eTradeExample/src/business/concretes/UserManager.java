package business.concretes;

import business.abstracts.BaseUserManager;
import business.abstracts.IUserValidationService;
import business.abstracts.IUserVerificationService;
import dataAccess.abstracts.IHibernateUserDao;

public class UserManager extends BaseUserManager {

	public UserManager(IUserValidationService userValidation, IHibernateUserDao userDao,
			IUserVerificationService userVerification) {
		super(userValidation, userDao, userVerification);
          
	}

}
