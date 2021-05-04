package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("New campaign created "+campaign.toString());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign deleted "+campaign.toString());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign updated "+campaign.toString());
	}

}
