package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface CampaignService {
	void add(Campaign campaign, Game game);
	void update(Campaign campaign, Game game);
	void delete(int campaignId, Game game);
	
}
