package gameExample.business.concretes;

import gameExample.business.abstracts.CampaignService;
import gameExample.dataAccess.concretes.CampaignDao;
import gameExample.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {
	CampaignDao campaignDao = new CampaignDao();

	@Override
	public void add(Campaign campaign) {
		campaignDao.add(campaign);
		System.out.println(" Kampanya Db'e eklendi " + campaign.getCampaignName());
	}

	@Override
	public void delete(Campaign campaign) {
		campaignDao.delete(campaign);
		System.out.println(" Kampanya Db'den silindi " + campaign.getCampaignName());
	}

	@Override
	public void update(Campaign campaign) {
		campaignDao.update(campaign);
		System.out.println(" Kampanya Db ile güncellendi " + campaign.getCampaignName());

	}

}
