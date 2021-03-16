public class SimpleCalculator {
    // Write a class SimpleCalculator. The class needs two fields (instance variables)
    // firstNumber and secondNumber both of type double
    private double firstNumber;
    private double secondNumber;

    // Write the following methods:
    // getFirstNumber()

    public double getFirstNumber() {
        return firstNumber;
    }

    // getSecondNumber()

    public double getSecondNumber() {
        return secondNumber;
    }

    // setFirstNumber()
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    // setSecondNumber()

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // getAdditionResult without any parameters it needs to return the result of adding firstNumber to secondNumber
    public double getAdditionResult() {
        return secondNumber + firstNumber;
    }

    // getSubtractionResult
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    // getMultiplicationResult
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    // getDivisionResult
    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }
}
