package fat.prep;
class Amount{
	private double balance;
	Amount(double balance){
		super();
		this.balance=balance;
		}
	public double getBalance() {
		return balance;
	}
	public void setBalance() {
		this.balance=balance;
	}
	public synchronized void deposit(double amount) {
		this.balance=balance+amount;
		System.out.println("balance after deposit: "+balance);
		try {
			Thread.currentThread().sleep(500);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		notify();
		System.out.println("deposit completed");
		System.out.println("notification sent");
	}
	public synchronized void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("insufficient balance");
			try {
				Thread.currentThread().sleep(500);
				System.out.println("waiting for deposit");
				wait();
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		this.balance=balance-amount;
		System.out.println("balance amount after withdrwal: "+balance);
	}
}
class Parent extends Thread{
	private Amount amount;
	Parent(Amount amount){
		this.amount=amount;
		
	}
	public void run() {
		amount.withdraw(1000);
	}
}
class Child extends Thread{
	private Amount amount;
	Child(Amount amount){
		this.amount=amount;
		
	}
	public void run() {
		amount.deposit(1000);
	}
}
public class Account {

	public static void main(String[] args) {
		Amount a=new Amount(500);
		Parent p=new Parent(a);
		Child c=new Child(a);
		p.start();
		c.start();
	
	}

}
