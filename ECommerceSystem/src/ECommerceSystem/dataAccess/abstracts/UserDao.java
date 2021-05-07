package ECommerceSystem.dataAccess.abstracts;

import java.util.ArrayList;

import ECommerceSystem.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	
	User get(int id);
	ArrayList<String> getAllMails();

}
