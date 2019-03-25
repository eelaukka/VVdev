package loginPage;
import fit.ColumnFixture;
import java.util.Date;

public class Bid extends ColumnFixture {
	private Date mBidTime;
	private double mPrice;
	private String mBidder;
	private Auction mAuction;
	
	public Bid() {
		super();
	}
	
	public Bid(Date mBidTime, double mPrice, String mBidder, Auction mAuction) {
		super();
		this.mBidTime = mBidTime;
		this.mPrice = mPrice;
		this.mBidder = mBidder;
		this.setmAuction(mAuction);
	}
	public Date getmBidTime() {
		return mBidTime;
	}
	public void setmBidTime(Date mBidTime) {
		this.mBidTime = mBidTime;
	}
	public double getmPrice() {
		return mPrice;
	}
	public void setmPrice(double mPrice) {
		this.mPrice = mPrice;
	}
	public String getmBidder() {
		return mBidder;
	}
	public void setmBidder(String mBidder) {
		this.mBidder = mBidder;
	}

	public Auction getmAuction() {
		return mAuction;
	}

	public void setmAuction(Auction mAuction) {
		this.mAuction = mAuction;
	}
	
	
}
