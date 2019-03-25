package loginPage;

import java.util.List;

public class Category {
	private int mCategoryID;
	private String mDescription;
	private List<Item> mItemList;
	
	public Category(int mCategoryID, String mDescription, List<Item> mItemList) {
		super();
		this.mCategoryID = mCategoryID;
		this.mDescription = mDescription;
		this.mItemList = mItemList;
	}

	public int getmCategoryID() {
		return mCategoryID;
	}

	public void setmCategoryID(int mCategoryID) {
		this.mCategoryID = mCategoryID;
	}

	public String getmDescription() {
		return mDescription;
	}

	public void setmDescription(String mDescription) {
		this.mDescription = mDescription;
	}

	public List<Item> getmItemList() {
		return mItemList;
	}

	public void setmItemList(List<Item> mItemList) {
		this.mItemList = mItemList;
	}
	
	
}
