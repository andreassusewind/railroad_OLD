package railroad;

public class Share extends Certificate{

	boolean president;
	int percentage;
	Corporation corp;
	
	public Share(String name, boolean isPresident, int percentage, Corporation corp) {
		super(name);
		this.president = isPresident;
		this.percentage = percentage;
		this.corp = corp;
	}

	@Override
	public boolean isPresident() {
		return president;
	}

	@Override
	public int getPercentage() {
		return percentage;
	}

	@Override
	public Corporation getCorp() {
		return corp;
	}
	
}
