package railroad;

public class Private extends Certificate{
	private int parvalue;
	private int revenue;
	
	public Private(String name, int parvalue, int revenue) {
		super(name);
		this.parvalue = parvalue;
		this.revenue = revenue;
	}
	
	@Override
	public void specialFkt() {}

	@Override
	public void directFkt() {}
	
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
