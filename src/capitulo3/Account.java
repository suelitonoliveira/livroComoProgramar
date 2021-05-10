package capitulo3;

public class Account {
	private String name;
	private double balance;

	public Account(String name, double balance) {
		this.name = name;
		if (balance > 0.0) { // valida que o balance é maior que 0.0 se não for mantém o valor inical padrão 0.0
			this.balance = balance;
		}

	}
	//adiciona apenas uma quantia válida no saldo
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) {
			balance = balance + depositAmount;
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}

}
