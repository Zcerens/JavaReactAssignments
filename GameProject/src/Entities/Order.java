package Entities;

public class Order {
	private int gamerId;
	private int gameId;
	private int campaignId;
	private int count;
	private int totalAmount;
	private int discountAmount;
	public int getGamerId() {
		return gamerId;
	}
	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public int getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}
	public int getAmountOfPayment() {
		return amountOfPayment;
	}
	public void setAmountOfPayment(int amountOfPayment) {
		this.amountOfPayment = amountOfPayment;
	}
	public Order(int gamerId, int gameId, int campaignId, int count, int totalAmount, int discountAmount,
			int amountOfPayment) {
		super();
		this.gamerId = gamerId;
		this.gameId = gameId;
		this.campaignId = campaignId;
		this.count = count;
		this.totalAmount = totalAmount;
		this.discountAmount = discountAmount;
		this.amountOfPayment = amountOfPayment;
	}
	private int amountOfPayment;
	

}
