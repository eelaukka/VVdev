package loginPage;
import fit.ColumnFixture;
import java.util.Date;
import java.util.List;


public class Auction extends ColumnFixture {
	private int mAuctionID;
	private Date mStartDate;
	private Date mEndDate;
	private double mStartPrice;
	private List<Bid> mBids;
	private Item mItem;
	
	public Auction(int mAuctionID, Date mStartDate, Date mEndDate, double mStartPrice, List<Bid> mBids, Item mItem) {
		this.mAuctionID = mAuctionID;
		this.mStartDate = mStartDate;
		this.mEndDate = mEndDate;
		this.mStartPrice = mStartPrice;
		this.mBids = mBids;
		this.mItem = mItem;
	}
	public int getmAuctionID() {
		return mAuctionID;
	}
	public void setmAuctionID(int mAuctionID) {
		this.mAuctionID = mAuctionID;
	}
	public Date getmStartDate() {
		return mStartDate;
	}
	public void setmStartDate(Date mStartDate) {
		this.mStartDate = mStartDate;
	}
	public Date getmEndDate() {
		return mEndDate;
	}
	public void setmEndDate(Date mEndDate) {
		this.mEndDate = mEndDate;
	}
	public double getmStartPrice() {
		return mStartPrice;
	}
	public void setmStartPrice(double mStartPrice) {
		this.mStartPrice = mStartPrice;
	}
	public List<Bid> getmBids() {
		return mBids;
	}
	public void setmBids(List<Bid> mBids) {
		this.mBids = mBids;
	}
	public Item getmItem() {
		return mItem;
	}
	public void setmItem(Item mItem) {
		this.mItem = mItem;
	}
	
	
	
}
