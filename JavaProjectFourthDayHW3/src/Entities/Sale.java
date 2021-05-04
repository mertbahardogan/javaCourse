package Entities;

import Abstract.Entity;

public class Sale implements Entity {

	private int id;
	private User user;
	private Campaign campaign;
	private Game game;

	public Sale() {

	}

	public Sale(int id, User user,Campaign campaign, Game game) {
		this();
		this.id = id;
		this.user = user;
		this.campaign = campaign;
		this.game = game;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public double getPriceWithDiscount() {
		return game.getUnitPrice() - (game.getUnitPrice() * campaign.getDiscount() / 100);
	}

	@Override
	public String toString() {
		if (campaign != null) {
			return "Info: [ID=" + id + ", GameName=" + game.getName() + ", CustomerName=" + user.getFirstName()
					+ ",LastPrice=" + getPriceWithDiscount() + ", Discount=" + campaign.getDiscount() + "]";
		} else {
			return "Info: [ID=" + id + ", GameName=" + game.getName() + ", CustomerName=" + user.getFirstName()
					+ ",Price=" + game.getUnitPrice() + "There is no campaign" + "]";
		}
	}
}
