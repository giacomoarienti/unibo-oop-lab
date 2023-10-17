package it.unibo.inheritance.impl;

public class ExtendedStrictBankAccount extends SimpleBankAccount  {

    private static final double TRANSACTION_FEE = 0.1;

    public ExtendedStrictBankAccount(final int id, final double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(final int id, final double amount) {
        if (this.isWithdrawAllowed(amount)) {
            this.transactionOp(id, -amount);
        }
    }

    @Override
    public void chargeManagementFees(final int id) {
        final double feeAmount = MANAGEMENT_FEE + this.getTransactionsCount() * ExtendedStrictBankAccount.TRANSACTION_FEE;
        if (this.checkUser(id) && this.isWithdrawAllowed(feeAmount)) {
            this.setBalance(this.getBalance() - feeAmount);
            this.resetTransactions();
        }
    }

    private void transactionOp(final int id, final double amount) {
        if (checkUser(id)) {
            this.setBalance(this.getBalance() + amount);
            this.incrementTransactions();
        }
    }

    private boolean isWithdrawAllowed(final double amount) {
        return this.getBalance() >= amount;
    }
}
