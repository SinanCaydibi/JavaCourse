package gameProje;

public class SaleManager implements SaleServices{

	@Override
	public void buyCampign(Campaign campaign , User user , Game game) {
		System.out.println(user.getNationalIdentity()+" "+ " "+ game.getGamePrice()+"$ "+ campaign.getCampaignDiscount()+ " "+ "purchased by campaign");
	}

}
