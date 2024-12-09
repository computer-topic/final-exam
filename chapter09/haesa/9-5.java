@Test
public void testBankAccount() {
    BankAccount account = new BankAccount();
    
    // balance is zero when created
    assertEquals(0, account.getBalance());
    
    // deposits
    account.deposit(100);
    assertEquals(100, account.getBalance());
    
    // withdrawals
    account.withdraw(50);
    assertEquals(50, account.getBalance());
}