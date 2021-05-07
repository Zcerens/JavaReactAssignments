package ECommerceSystem.business.abstracts;

import java.util.ArrayList;

import ECommerceSystem.entities.concretes.User;

public interface ValidationService {
	boolean passwordIsVerified(User user);
	boolean EmailIsVerified(String email);
	boolean firstNameIsVerified(User user);
	boolean lastNameIsVerified(User user);
}
