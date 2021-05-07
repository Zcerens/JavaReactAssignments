package ECommerceSystem.business.concretes;

import ECommerceSystem.business.abstracts.EMailService;

public class EMailManager implements EMailService{

	@Override
	public void send() {
		System.out.println("Doðrulama mesajý gönderildi.");
		
	}

	@Override
	public void verify() {
		System.out.println("Email doðrulandý :)");
		
	}

}
