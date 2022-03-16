package gameExample.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import gameExample.entities.concretes.Gamer;

public class GamerDao {
	List<Gamer> gamers = new ArrayList<Gamer>();

	public void add(Gamer gamer) {
		gamers.add(gamer);
	}

	public void delete(Gamer gamer) {
		gamers.remove(gamer);
	}

	public void update(Gamer gamer) {
		// güncellenecektir
	}

	public List<Gamer> getAll() {
		return gamers;
	}
}
