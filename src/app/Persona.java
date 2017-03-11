package app;

public class Persona {
	
	protected int user_number;
	protected long identification;
	protected String name;
	protected double money_amount;
	
	public Persona(int user_number, long identification, String name,
			double money_amount) {
		super();
		this.user_number = user_number;
		this.identification = identification;
		this.name = name;
		this.money_amount = money_amount;
	}

	public int getUser_number() {
		return user_number;
	}

	public void setUser_number(int user_number) {
		this.user_number = user_number;
	}

	public long getIdentification() {
		return identification;
	}

	public void setIdentification(long identification) {
		this.identification = identification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney_amount() {
		return money_amount;
	}

	public void setMoney_amount(double money_amount) {
		this.money_amount = money_amount;
	}

	public String toString() {
		return "Persona [user_number=" + user_number + ", identification="
				+ identification + ", name=" + name + ", money_amount="
				+ money_amount + "]";
	}
	

}
