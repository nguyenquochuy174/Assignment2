public class Calculator {
    enum SIGN{
        minus, plus, divide, multiply
    }
    private Double calculator(SIGN sign, Double arg1, Double arg2) {
        switch (sign) {
            case minus:
                return arg1 - arg2;
            case plus:
                return arg1 + arg2;
            default:
                break;
        }
        return 0d;
    }
}