package gameExample.business.abstracts;

import java.util.List;

import gameExample.entities.concretes.Game;

public interface GameService {
	void add(Game game);

	void delete(Game game);

	void update(Game game);

	List<Game> getAll();

}
