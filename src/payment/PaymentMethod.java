package payment;

public interface PaymentMethod {
    boolean pay(int amount);
    int getBalance();
    void topUp(int amount);
}
