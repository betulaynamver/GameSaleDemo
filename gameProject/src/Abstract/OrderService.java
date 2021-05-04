package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public interface OrderService {
	
	void satinAlma(User user, Game game);
	void kampanyaliSatinAlma(User user, Game game, Campaign campaign);

}
