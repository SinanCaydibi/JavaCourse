package gameProje;

public class Campaign {
	private int id ;
	private String campaignName;
	private int campaignDiscount;
	public Campaign() {
		
	}
	public Campaign(int id, String campaignName, int campaignDiscount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.campaignDiscount = campaignDiscount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public int getCampaignDiscount() {
		return campaignDiscount;
	}
	public void setCampaignDiscount(int campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	};

}
