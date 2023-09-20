package Week1.GDSC_1st_HW;

public class CalculatorImpl implements Calculator{

    @Override
    public int plus(int A, int B) {
        return A + B;
    }

    @Override
    public int minus(int A, int B) {
        return A - B;
    }

    @Override
    public int mul(int A, int B) {
        return A * B;
    }

    @Override
    public int div(int A, int B) {
        return A / B;
    }
}
