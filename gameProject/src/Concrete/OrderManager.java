package Concrete;

import Abstract.OrderService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class OrderManager implements OrderService {

	@Override
	public void satinAlma(User user, Game game) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullan�c� " + game.getGameName()
				+ " isimli oyunu " + game.getGamePrice() + " TL'ye sat�n ald�.");
	}

	@Override
	public void kampanyaliSatinAlma(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullan�c� " + game.getGameName()
				+ " isimli oyunu " + "% " + campaign.getDiscountRate() + " indirim oran�yla " + game.getGamePrice() + " TL yerine " +
				(game.getGamePrice()-((game.getGamePrice()*campaign.getDiscountRate())/100)) + " TL'ye sat�n ald�.");
	}

}
