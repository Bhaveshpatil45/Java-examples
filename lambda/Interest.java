package lambda;

@FunctionalInterface
public interface Interest {

    double calculate(int principalAmt, float interestRate);
}
