package Taller4.DAO;

public class Account {
    private String name;
    private String accountType;
    private double balance;
    private String identificacion;

    public Account(String name, String accountType, double balance, String identificacion) {
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
        this.identificacion = identificacion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificación) {
        this.identificacion = identificación;
    }
}
