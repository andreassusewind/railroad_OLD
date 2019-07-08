package railroad;

public class Private {
	private String name;
	private int parvalue;
	private int revenue;
	
	public Private(String name, int parvalue, int revenue) {
		super();
		this.name = name;
		this.parvalue = parvalue;
		this.revenue = revenue;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getParvalue() {
		return parvalue;
	}
	public void setParvalue(int parvalue) {
		this.parvalue = parvalue;
	}
	public int getRevenue() {
		return revenue;
	}
	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}
}
