package Abstract;

import Entities.Gamer;

public interface OrderService {
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);

}
