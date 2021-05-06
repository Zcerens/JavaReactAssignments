package Concrete;

import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu eklendi : " + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

}
