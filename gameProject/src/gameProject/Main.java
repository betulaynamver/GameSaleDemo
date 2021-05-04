package gameProject;

import java.text.DateFormat;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;
import Validation.Validation;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Betülay", "Namver", 2000, "1234567890");
		User user2 = new User(2, "Can", "Yüksel", 1993, "1357913587");
		User user3 = new User(3, "Mehmet", "Namver", 1998, "1897543021");
		
		Game game1 = new Game(101, "Sims 4", 180);
		Game game2 = new Game(102, "Counter Strike", 225);
		Game game3 = new Game(103, "Fifa 2021", 410);
		
		Campaign campaign1 = new Campaign(201, "Karne hediyesi ", 10);
		Campaign campaign2 = new Campaign(202, "Öðrenci ", 15);
		Campaign campaign3 = new Campaign(203, "Yeni üye ", 20);
		
		Validation validation = new Validation();
		UserManager userManager = new UserManager();
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		OrderManager orderManager = new OrderManager();
		
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.add(game3);
		
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		campaignManager.add(campaign3);
		
		validation.eDevlet(user1);
		userManager.add(user1);
		orderManager.kampanyaliSatinAlma(user1, game1, campaign2);
		System.out.println("******************************************************");
		
		validation.eDevlet(user2);
		userManager.add(user2);
		orderManager.kampanyaliSatinAlma(user2, game3, campaign3);
		System.out.println("******************************************************");
		
		userManager.delete(user3);
		System.out.println("******************************************************");

	}

}
