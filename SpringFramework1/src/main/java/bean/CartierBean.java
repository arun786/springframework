package bean;

public class CartierBean {
	private String auctionId;
	private String bid;
	private String bidtime;
	private String bidder;
	private String openBid;
	private String price;

	public CartierBean(String auctionId, String bid, String bidtime, String bidder, String openBid, String price) {
		super();
		this.auctionId = auctionId;
		this.bid = bid;
		this.bidtime = bidtime;
		this.bidder = bidder;
		this.openBid = openBid;
		this.price = price;
	}

	public String getAuctionId() {
		return auctionId;
	}

	public void setAuctionId(String auctionId) {
		this.auctionId = auctionId;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBidtime() {
		return bidtime;
	}

	public void setBidtime(String bidtime) {
		this.bidtime = bidtime;
	}

	public String getBidder() {
		return bidder;
	}

	public void setBidder(String bidder) {
		this.bidder = bidder;
	}

	public String getOpenBid() {
		return openBid;
	}

	public void setOpenBid(String openBid) {
		this.openBid = openBid;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CartierBean [auctionId=" + auctionId + ", bid=" + bid + ", bidtime=" + bidtime + ", bidder=" + bidder
				+ ", openBid=" + openBid + ", price=" + price + "]";
	}

}
