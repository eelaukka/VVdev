package loginPage;
import fit.ColumnFixture;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class User extends ColumnFixture {
	private String mUserName;
	private String mPassword;
	private String mName;
	private String mAddress;
	private String mPhone;
	private String mEmail;
	
	public User() {
		super();
	}
	
	public User(String mUserName, String mPassword, String mName, String mAddress, String mPhone, String mEmail) {
		super();
		this.mUserName = mUserName;
		this.mPassword = mPassword;
		this.mName = mName;
		this.mAddress = mAddress;
		this.mPhone = mPhone;
		this.mEmail = mEmail;
	}

	public boolean userRegistered() {
		String csvFile = "user_database.csv";
        BufferedReader br = null;
        String line = " ";
        if (mUserName==null || mPassword==null) {
        	return false;
        }
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (mUserName.equals(data[0]) && mPassword.equals(data[1])) {
                	return true;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
	}
	
	public String getmUserName() {
		return mUserName;
	}
	public void setmUserName(String mUserName) {
		this.mUserName = mUserName;
	}
	public String getmPassword() {
		return mPassword;
	}
	public void setmPassword(String mPassword) {
		this.mPassword = mPassword;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmAddress() {
		return mAddress;
	}

	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}

	public String getmPhone() {
		return mPhone;
	}

	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}

	public String getmEmail() {
		return mEmail;
	}

	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}
	
	
	
}
