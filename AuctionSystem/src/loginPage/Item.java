package loginPage;

import java.util.List;

public class Item {
	private int mCode;
	private String mDescription;
	private double mBidIncrement;
	private ItemImage mImage;
	private List<Auction> mAuctionList;
	private Category mCategory;
	private Seller mSeller;
	
	public Item(int mCode, String mDescription, double mBidIncrement, ItemImage mImage, List<Auction> mAuctionList, Category mCategory, Seller mSeller) {
		super();
		this.mCode = mCode;
		this.mDescription = mDescription;
		this.mBidIncrement = mBidIncrement;
		this.mImage = mImage;
		this.mAuctionList = mAuctionList;
		this.mCategory = mCategory;
		this.mSeller = mSeller;
	}

	public int getmCode() {
		return mCode;
	}

	public void setmCode(int mCode) {
		this.mCode = mCode;
	}

	public String getmDescription() {
		return mDescription;
	}

	public void setmDescription(String mDescription) {
		this.mDescription = mDescription;
	}

	public double getmBidIncrement() {
		return mBidIncrement;
	}

	public void setmBidIncrement(double mBidIncrement) {
		this.mBidIncrement = mBidIncrement;
	}

	public ItemImage getmImage() {
		return mImage;
	}

	public void setmImage(ItemImage mImage) {
		this.mImage = mImage;
	}

	public List<Auction> getmAuctionList() {
		return mAuctionList;
	}

	public void setmAuctionList(List<Auction> mAuctionList) {
		this.mAuctionList = mAuctionList;
	}

	public Category getmCategory() {
		return mCategory;
	}

	public void setmCategory(Category mCategory) {
		this.mCategory = mCategory;
	}

	public Seller getmSeller() {
		return mSeller;
	}

	public void setmSeller(Seller mSeller) {
		this.mSeller = mSeller;
	}
	
	
	
}
