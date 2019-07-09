package railroad;

public class Private extends Certificate{
	private String initials;
	private int parvalue;
	private int revenue;
	
	public Private(String name, String initials, int parvalue, int revenue) {
		super(name);
		this.initials = initials;
		this.parvalue = parvalue;
		this.revenue = revenue;
	}
	
	@Override
	public String getInitials() {
		return initials;
	}

	@Override
	public void setInitials(String initials) {
		this.initials = initials;
	}

	@Override
	public int getParvalue() {
		return parvalue;
	}
	@Override
	public void setParvalue(int parvalue) {
		this.parvalue = parvalue;
	}
	@Override
	public int getRevenue() {
		return revenue;
	}
	@Override
	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}
}
