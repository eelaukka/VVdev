package loginPage;

import java.util.List;

public class Seller {
	private String mSSN;
	private List<Item> mItemList;
	
	public Seller(String mSSN, List<Item> mItemList) {
		super();
		this.mSSN = mSSN;
		this.mItemList = mItemList;
	}

	public String getmSSN() {
		return mSSN;
	}

	public void setmSSN(String mSSN) {
		this.mSSN = mSSN;
	}

	public List<Item> getmItemList() {
		return mItemList;
	}

	public void setmItemList(List<Item> mItemList) {
		this.mItemList = mItemList;
	}
	
	
}
