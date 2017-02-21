package app;

public class Empleado extends Persona {
	
	private int years_worked;
	private int holidays;
	private String charge;
	private double sallary;
	private int bank_account;
	private int bank_key;
	
	public Empleado(int user_number, long identification, String name,
			double money_amount, int years_worked, int holidays, String charge,
			double sallary, int bank_account, int bank_key) {
		super(user_number, identification, name, money_amount);
		this.years_worked = years_worked;
		this.holidays = holidays;
		this.charge = charge;
		this.sallary = sallary;
		this.bank_account = bank_account;
		this.bank_key = bank_key;
	}

	public int getYears_worked() {
		return years_worked;
	}

	public void setYears_worked(int years_worked) {
		this.years_worked = years_worked;
	}

	public int getHolidays() {
		return holidays;
	}

	public void setHolidays(int holidays) {
		this.holidays = holidays;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public double getSallary() {
		return sallary;
	}

	public void setSallary(double sallary) {
		this.sallary = sallary;
	}

	public int getBank_account() {
		return bank_account;
	}

	public void setBank_account(int bank_account) {
		this.bank_account = bank_account;
	}

	public int getBank_key() {
		return bank_key;
	}

	public void setBank_key(int bank_key) {
		this.bank_key = bank_key;
	}

	public String toString() {
		return "Empleado [years_worked=" + years_worked + ", holidays="
				+ holidays + ", charge=" + charge + ", sallary=" + sallary
				+ ", bank_account=" + bank_account + ", bank_key=" + bank_key
				+ "]";
	}

}
