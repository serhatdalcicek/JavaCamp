package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.IUserVerificationService;
import entities.concretes.User;

public class UserVerificationManager implements IUserVerificationService{
    List<String> verifyEmails;  
    
    public UserVerificationManager() {
    	this.verifyEmails = new ArrayList<>();
    }
	
	@Override
	public void sendToVerifyMail(User user) {
		System.out.println(
				"Hey dear " + user.getFirstName() 
				+ " , " + user.getEmail() + " adresine doğrulama maili gönderdik bakar mısın :)) ?"
				);
	}

	@Override
	public boolean verifyMail(String email) {

		try {
			verifyEmails.add(email);
			System.out.println("Mail adresin doğrulandı :) Aramıza Hoş Geldin :))");
			return true;
		}catch (Exception e) {
			
			System.out.println(e.getMessage());
			return false;

		}
		
		
	}

	@Override
	public boolean checkVerifyAccount(String email) { //doğrulanmış emailler listede varsa true döndürür
      if (verifyEmails.contains(email)) {
    	  return true;
      }
		return false;
	}
  
}
