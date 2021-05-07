package ECommerceSystem.business.concretes;

import java.util.ArrayList;

import java.util.regex.Pattern;

import ECommerceSystem.business.abstracts.ValidationService;
import ECommerceSystem.entities.concretes.User;

public class ValidationManager implements ValidationService {

	@Override
	public boolean passwordIsVerified(User user) {
		boolean b = false;
		if(user.getPassword().length()>=6) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}

	@Override
	public boolean EmailIsVerified(String eMail) {
		
	        String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	        Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
	        
	        return pattern.matcher(eMail).find();
	    
	}

	@Override
	public boolean firstNameIsVerified(User user) {
		boolean b = false;
		if(user.getFirstName().length()>=2) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}

	@Override
	public boolean lastNameIsVerified(User user) {
		boolean b = false;
		if(user.getLastName().length()>=2) {
			b = true;
		} else {
			b = false;
		}
		return b;
		
	}
	
	

}
