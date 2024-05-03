package Entities;

public class BusinnessAccount extends Account {

    private Double loanLimit;

    // Construtor padr�o
    public BusinnessAccount() {
        super();
    }

    // Construtor com argumentos
    public BusinnessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    // Getters e Setters
    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    // M�todo para opera��o de empr�stimo
    public void operacaoEmprestimo(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }

    // Sobrescrita do m�todo operacaoSaque
    @Override
    public void operacaoSaque(double amount) {
       super.operacaoSaque(amount);
       balance -= 2.0;
    }
}
