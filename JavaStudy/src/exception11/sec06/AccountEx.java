package exception11.sec06;

public class AccountEx {
	public static void main(String[] args) {
		
		Account account = new Account();
		account.depoist(10000);
		System.out.println("예금액"+account.getBalance());
		
		try {
			account.withdraw(30000);
		} catch (InsufiicientEx e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("예금액"+account.getBalance());
	}
}
