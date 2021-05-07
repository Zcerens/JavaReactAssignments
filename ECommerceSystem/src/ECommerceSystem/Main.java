package ECommerceSystem;

import ECommerceSystem.business.abstracts.EMailService;
import ECommerceSystem.business.abstracts.UserService;
import ECommerceSystem.business.concretes.EMailManager;
import ECommerceSystem.business.concretes.UserManager;
import ECommerceSystem.business.concretes.ValidationManager;
import ECommerceSystem.core.MyRegistrationManager;
import ECommerceSystem.dataAccess.concretes.HibernateUserDao;
import ECommerceSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User ceren = new User(1, "Ceren", "Sahin", "ceren@gmail.com", "123456");
		User efe = new User(1, "Efe", "Sahin", "efesahin@gmail.com", "741852963");
		
		
		UserService userService = new UserManager(new HibernateUserDao(),
				new MyRegistrationManager(),
				new ValidationManager());
		
		EMailService eMailService = new EMailManager();
		
		userService.Login(ceren, "ceren@gmail.com", "123789");
		userService.SignUp(efe);
		

	}

}
