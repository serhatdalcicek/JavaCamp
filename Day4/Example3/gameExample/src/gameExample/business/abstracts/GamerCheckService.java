package gameExample.business.abstracts;

import gameExample.entities.concretes.Gamer;

//oyuncuların e devlet üzerinde kayıtlı olduğunu kontrol eden classın referansını tutan interface
public interface GamerCheckService {
	boolean checkRealPerson(Gamer gamer);
}
