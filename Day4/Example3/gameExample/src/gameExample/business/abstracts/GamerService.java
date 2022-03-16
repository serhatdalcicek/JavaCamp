package gameExample.business.abstracts;

import java.util.List;

import gameExample.entities.concretes.Gamer;

public interface GamerService {
	void add(Gamer gamer);

	void delete(Gamer gamer);

	void update(Gamer gamer);

	List<Gamer> getAll();
}
