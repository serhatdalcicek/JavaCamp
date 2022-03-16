package gameExample.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import gameExample.entities.concretes.Game;

public class GameDao {
	List<Game> games = new ArrayList<Game>();

	public void add(Game game) {
		games.add(game);
	}

	public void delete(Game game) {
		games.remove(game);
	}

	public void update(Game game) {
		// güncellenecektir
	}

	public List<Game> getAll() {
		return games;
	}
}
