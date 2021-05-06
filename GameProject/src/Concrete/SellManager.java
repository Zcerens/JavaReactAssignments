package Concrete;

import Abstract.SellService;
import Entities.Game;
import Entities.Gamer;

public class SellManager implements SellService{

	@Override
	public void buyGame(Gamer gamer, Game game) {
		System.out.println(game.getName() + " " + game.getPrice() + "TL'dir.");
		
	}
	
	
	

}
