package gameExample.business.concretes;

import java.util.List;

import gameExample.business.abstracts.GamerService;
import gameExample.dataAccess.concretes.GamerDao;
import gameExample.entities.concretes.Gamer;

//sadece oyuncu eklenmesi çıkarılması güncellemensi buradan yönetilir
public class GamerManager implements GamerService {

	private GamerCheckManager gamerCheckManager;

	public GamerManager(GamerCheckManager gamerCheckManager) {
		super();
		this.gamerCheckManager = gamerCheckManager;
	}

	GamerDao gamerDao = new GamerDao();

	@Override
	public void add(Gamer gamer) {
		if (gamerCheckManager.checkRealPerson(gamer)) {
			gamerDao.add(gamer);
			System.out.println("Kullanıcı Db'e eklendi " + gamer.getFirstName());
		} else {
			System.out.println("Kullanıcı kayıtlı değildir. ");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		gamerDao.delete(gamer);
		System.out.println("Kullanıcı Db'den silindi " + gamer.getFirstName());
	}

	@Override
	public void update(Gamer gamer) {
		gamerDao.update(gamer);
		System.out.println("Kullanıcı Db ile güncellendi " + gamer.getFirstName());
	}

	@Override
	public List<Gamer> getAll() {

		return gamerDao.getAll();
	}

}
