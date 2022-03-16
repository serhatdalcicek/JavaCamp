package gameExample.business.abstracts;

import gameExample.entities.concretes.Campaign;
import gameExample.entities.concretes.Game;
import gameExample.entities.concretes.Gamer;

public interface SaleManagerService {
	void sale(Gamer gamer, Campaign campaign, Game game);
}
