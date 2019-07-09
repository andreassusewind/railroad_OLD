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
	

	// Methods used by Private
	public void specialFkt() {}
	public void directFkt() {}
	public int getParvalue() {return 0;}
	public void setParvalue(int parvalue) {}
	public int getRevenue() {return 0;}
	public void setRevenue(int revenue) {}
	
}
