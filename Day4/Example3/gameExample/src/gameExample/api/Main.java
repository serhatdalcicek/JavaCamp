package gameExample.api;

import java.util.List;

import gameExample.business.abstracts.CampaignService;
import gameExample.business.abstracts.GameService;
import gameExample.business.abstracts.GamerService;
import gameExample.business.abstracts.SaleManagerService;
import gameExample.business.concretes.CampaignManager;
import gameExample.business.concretes.GameManager;
import gameExample.business.concretes.GamerCheckManager;
import gameExample.business.concretes.GamerManager;
import gameExample.business.concretes.SaleManager;
import gameExample.entities.concretes.Campaign;
import gameExample.entities.concretes.Game;
import gameExample.entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {

		GamerService gamerService = new GamerManager(new GamerCheckManager());

		Gamer gamer1 = new Gamer(1, "12345", "Serhat", "Dalçiçek", "28.08.98", "serhatdalcicek");

		GameService gameService = new GameManager();

		Game game = new Game(1, "Call Of Duty", 199.99);

		Campaign campaign = new Campaign(1, 10, "Öğrenci indirimi");

		CampaignService campaignService = new CampaignManager();

		gamerService.add(gamer1);

		gameService.add(game);

		campaignService.add(campaign);

		SaleManagerService saleManagerService = new SaleManager();

		saleManagerService.sale(gamer1, campaign, game);

		Gamer gamer2 = new Gamer(2, "6789", "Ozan", "Polat", "22.02.97", "ozanplt");

		gamerService.add(gamer2);

		saleManagerService.sale(gamer2, campaign, game);

		for (Gamer gamer : gamerService.getAll()) {

			System.out.println(gamer.getFirstName());
		}

	}

}
