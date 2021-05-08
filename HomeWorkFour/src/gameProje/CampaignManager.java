package gameProje;

public class CampaignManager implements CampaignServices {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " "+ "Campaign"+ " "+ campaign.getCampaignDiscount()+" % "+"discount granted ");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName()+" "+"Campaign deleted");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName()+" "+"Campaign updated");
	}

	
	

}
