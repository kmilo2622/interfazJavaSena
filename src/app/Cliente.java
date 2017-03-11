package app;

public class Cliente extends Persona {
	
	private int operation;
	private String bank_account;
	private String bank_key;
	
	public Cliente(int user_number, long identification, String name,
			double money_amount, int operation, String bank_account,
			String bank_key) {
		super(user_number, identification, name, money_amount);
		this.operation = operation;
		this.bank_account = bank_account;
		this.bank_key = bank_key;
	}

	public int getOperation() {
		return operation;
	}

	public void setOperation(int operation) {
		this.operation = operation;
	}

	public String getBank_account() {
		return bank_account;
	}

	public void setBank_account(String bank_account) {
		this.bank_account = bank_account;
	}

	public String getBank_key() {
		return bank_key;
	}

	public void setBank_key(String bank_key) {
		this.bank_key = bank_key;
	}

	public String toString() {
		return "Cliente [operation=" + operation + ", bank_account="
				+ bank_account + ", bank_key=" + bank_key + "]";
	}
	

}
