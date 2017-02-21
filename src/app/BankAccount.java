package app;

public abstract class BankAccount {
	
	//Declaración de variables finales para el uso en el resto de código. 	
	public static final int idaccount_ahorro = 1;
	public static final String CUENTA_AHORRO = "Ahorros";
	public static final int id_account_credito = 2;
	public static final String CUENTA_INVERSION = "Inversión";
	
	//Declaración de variables no finales.
	private float risk_level;
	private float inversion_ammount;
	private float return_pecentage;
	private float inversion_terms;
	
	public BankAccount(float risk_level, float inversion_ammount,
			float return_pecentage, float inversion_terms) {
		super();
		this.risk_level = risk_level;
		this.inversion_ammount = inversion_ammount;
		this.return_pecentage = return_pecentage;
		this.inversion_terms = inversion_terms;
	}

	public float getRisk_level() {
		return risk_level;
	}

	public void setRisk_level(float risk_level) {
		this.risk_level = risk_level;
	}

	public float getInversion_ammount() {
		return inversion_ammount;
	}

	public void setInversion_ammount(float inversion_ammount) {
		this.inversion_ammount = inversion_ammount;
	}

	public float getReturn_pecentage() {
		return return_pecentage;
	}

	public void setReturn_pecentage(float return_pecentage) {
		this.return_pecentage = return_pecentage;
	}

	public float getInversion_terms() {
		return inversion_terms;
	}

	public void setInversion_terms(float inversion_terms) {
		this.inversion_terms = inversion_terms;
	}

	public String toString() {
		return "BankAccount [risk_level=" + risk_level + ", inversion_ammount="
				+ inversion_ammount + ", return_pecentage=" + return_pecentage
				+ ", inversion_terms=" + inversion_terms + "]";
	}
	
	

}
