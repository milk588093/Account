package practice;

public class Account {
	private String number = null;
	private String name = null;
	private String password = null;
	private int money = 0;
	
	public Account(String number,String name,String password,int money) {
		this.number=number;
		this.name=name;
		this.password=password;
		this.money=money;
	}
	public void setMoney(int money) {
		this.money=money;
	}
	public int getMoney() {
		return money;
	}
	
	
	
}
