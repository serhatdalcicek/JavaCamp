package gameExample.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import gameExample.entities.concretes.Campaign;

public class CampaignDao {
	List<Campaign> campaigns = new ArrayList<Campaign>();

	public void add(Campaign campaign) {
		campaigns.add(campaign);
	}

	public void delete(Campaign campaign) {
		campaigns.remove(campaign);
	}

	public void update(Campaign campaign) {
		// güncellenecektir
	}

	public List<Campaign> getAll() {
		return campaigns;
	}
}
