import Abstract.CampaignService;
import Abstract.GamerService;
import Abstract.SellService;
import Concrete.CampaignManager;
import Concrete.GamerManager;
import Concrete.SellManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer(1, "Ceren", "Þahin", "1234");
		Game game1 = new Game("ETS", 1, 150);
		Campaign campaign1 = new Campaign(1, "%5", 5);
		
		
		GamerService gamerService = new GamerManager();
		gamerService.add(gamer1);
		
		SellService sellService = new SellManager();
		sellService.buyGame(gamer1, game1);
		
		CampaignService campaignService = new CampaignManager();
		campaignService.add(campaign1, game1);
		
		

	}

}
