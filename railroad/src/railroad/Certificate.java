package railroad;

public class Certificate {
	private String name;
	
	public Certificate(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Methods used by Corp-Shares
	public boolean isPresident() {return false;}
	public void setPresident(boolean president) {}
	public int getPercentage() {return 0;}
	public void setPercentage(int percentage) {}
	public Corporation getCorp() {return null;}
	public void setCorp(Corporation corp) {}

	// Methods used by Private
	public void specialFkt() {}
	public void directFkt() {}
	public int getParvalue() {return 0;}
	public void setParvalue(int parvalue) {}
	public int getRevenue() {return 0;}
	public void setRevenue(int revenue) {}
	public String getInitials() {return null;}
	public void setInitials(String initials) {}

}
