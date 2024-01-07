package exception11.sec06;

public class Account {
	private long balance;
	
	public Account() {
		
	}

	public long getBalance() {
		return balance;
	}
	
	public void depoist(int money) {
		balance = money;
	}
	// 호출한 곳으로 예외 떠넘긴다
	public void withdraw(int money) throws InsufiicientEx{
		if (balance < money) {
			throw new InsufiicientEx("잔고부족");
		}
		balance -= money;
	}
}
