package core.concretes;

import business.abstracts.BaseUserManager;
import business.abstracts.IUserValidationService;
import business.abstracts.IUserVerificationService;
import dataAccess.abstracts.IHibernateUserDao;

public class EmailLoginAdapter extends BaseUserManager {

	public EmailLoginAdapter(IUserValidationService userValidation, IHibernateUserDao userDao,
			IUserVerificationService userVerification) {
		super(userValidation, userDao, userVerification);
	}

}
