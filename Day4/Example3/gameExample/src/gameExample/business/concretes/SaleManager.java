package gameExample.business.concretes;

import gameExample.business.abstracts.SaleManagerService;
import gameExample.entities.concretes.Campaign;
import gameExample.entities.concretes.Game;
import gameExample.entities.concretes.Gamer;

public class SaleManager implements SaleManagerService {

	@Override
	public void sale(Gamer gamer, Campaign campaign, Game game) {
		System.out.println(gamer.getFirstName() + " Adlı Kullanıcıya : " + game.getName() + " Oyunu'nun "
				+ campaign.getCampaignName() + " Kampanyası ile satılmıştır ");
	}

}
