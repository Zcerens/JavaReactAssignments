package ECommerceSystem.business.abstracts;

import ECommerceSystem.entities.concretes.User;

public interface UserService {
	void SignUp(User user);
	void Login(User user, String eMail, String password);
	

}
