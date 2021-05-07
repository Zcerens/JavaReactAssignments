package ECommerceSystem.business.concretes;

import ECommerceSystem.business.abstracts.UserService;
import ECommerceSystem.business.abstracts.ValidationService;
import ECommerceSystem.core.SignUpService;
import ECommerceSystem.dataAccess.abstracts.UserDao;
import ECommerceSystem.entities.concretes.User;


public class UserManager implements UserService {
	private UserDao userDao;
	private SignUpService signinService;
	private ValidationService validationService;
	@Override
	public void SignUp(User user) {
		if (validationService.EmailIsVerified(user.getEmail()) == true 
				&& validationService.firstNameIsVerified(user) == true
				&& validationService.lastNameIsVerified(user) == true
				&& validationService.passwordIsVerified(user) == true) {
			System.out.println("Sifre ve E-mail gecerli. Kayit yapildi: " + user.getFirstName());
			this.userDao.add(user);
			this.signinService.signUp();
		} else {
			System.out.println("Email veya sifre gecersiz.");
		}
		
	}
	@Override
	public void Login(User user, String eMail, String password) {
		if (eMail == user.getEmail() && password == user.getPassword()) {
			System.out.println("Bilgiler dogru. Giris yapildi.");
		} else {
			System.out.println("Giris basarisiz. Yanlis email ve sifre girdiniz.");
		}
		
	}
	public UserManager(UserDao userDao, SignUpService signinService, ValidationService validationService) {
		super();
		this.userDao = userDao;
		this.signinService = signinService;
		this.validationService = validationService;
	}
	



}
