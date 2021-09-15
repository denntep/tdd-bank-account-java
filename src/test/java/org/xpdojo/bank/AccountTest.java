package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AccountTest {

    @Test
    public void startingBalanceIsZero() {
        Account account = new Account();
        assertThat(account.balance,is(0));
    }
    
    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(100);
        assertThat(account.balance, is(100));
    }

    @Test
    public void depositMultipleAmountsToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(100);
        account.deposit(100);
        assertThat(account.balance,is(200));
    }

    @Test
    public void withdrawAnAmountToDecreaseTheBalance() {
        Account account = new Account();
        account.deposit(500);
        account.withdraw(300);
        assertThat(account.balance, is(200));
    }

    @Test
    public void withdrawMultipleAmountsToDecreaseTheBalance() {
        Account account = new Account();
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(100);
        assertThat(account.balance, is(100));
    }
}
