package gameExample.entities.concretes;

import gameExample.entities.abstracts.Entity;

public class Campaign extends Entity {
	private double discountRate;
	private double discountedPrice;// indirim uygulanmış hali
	private String campaignName;

	public Campaign() {
		super();
	}

	public Campaign(int id, double discountRate, String campaignName) {

		super(id);
		this.discountRate = discountRate;
		this.campaignName = campaignName;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public double getDiscountedPrice(Game game) {
		this.discountedPrice = game.getPrice() - game.getPrice() * this.discountRate;
		return discountedPrice;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
}
