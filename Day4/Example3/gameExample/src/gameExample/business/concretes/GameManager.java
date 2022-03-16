package gameExample.business.concretes;

import java.util.List;

import gameExample.business.abstracts.GameService;
import gameExample.dataAccess.concretes.GameDao;
import gameExample.entities.concretes.Game;

public class GameManager implements GameService {
	GameDao gameDao = new GameDao();

	@Override
	public void add(Game game) {
		gameDao.add(game);
		System.out.println(" Oyun Db'e eklendi " + game.getName());
	}

	@Override
	public void delete(Game game) {
		gameDao.delete(game);
		System.out.println(" Oyun Db'den silindi " + game.getName());
	}

	@Override
	public void update(Game game) {
		gameDao.update(game);
		System.out.println(" Oyun Db ile güncellendi " + game.getName());
	}

	@Override
	public List<Game> getAll() {

		return gameDao.getAll();
	}

}
