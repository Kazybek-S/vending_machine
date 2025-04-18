package payment;

public class CashPayment implements PaymentMethod {
    private int balance;

    public CashPayment() {
        this.balance = 0;
    }

    @Override
    public boolean pay(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true; // Оплата прошла успешно
        } else {
            return false; // Недостаточно средств
        }
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void topUp(int amount) {
        balance += amount;
    }
}
