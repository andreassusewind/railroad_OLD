package railroad;

import java.util.ArrayList;
import java.util.List;

public class Corporation {
	String name;
	String initials;
	// Change List Type to Share
	List<Share>   initialStock = new ArrayList<Share>();
	List<Share>   bankStock    = new ArrayList<Share>();
	List<Private> privs        = new ArrayList<Private>();
	
	public Corporation(String name, String initials) {
		this.name = name;
		this.initials = initials;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public List<Share> getInitialStock() {
		return initialStock;
	}

	public void addInitialStock(Share cert) {
		this.initialStock.add(cert);
	}

	public List<Share> getBankStock() {
		return bankStock;
	}

	public void addBankStock(Share cert) {
		this.bankStock.add(cert);
	}

	public List<Private> getPrivs() {
		return privs;
	}

	public void addPrivs(Private priv) {
		this.privs.add(priv);
	}
	
	
}
