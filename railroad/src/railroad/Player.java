package railroad;

import java.util.ArrayList;
import java.util.List;

public class Player {

	String name;
	List<Certificate> certs = new ArrayList<Certificate>();
	int money;
	
	public Player(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public List<Certificate> getCerts() {
		return certs;
	}

	public void addCert(Certificate cert) {
		this.certs.add(cert);
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public void increaseMoney(int div) {
		this.money = this.money + div;
	}
	
	public void decreaseMoney(int div) {
		this.money = this.money - div;
	}
}
