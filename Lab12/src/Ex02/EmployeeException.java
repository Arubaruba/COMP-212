package Ex02;

public class EmployeeException extends Exception {

    String idAndPay;

    public EmployeeException(String idAndPay) {
        this.idAndPay = idAndPay;
    }

    @Override
    public String getMessage() {
        return idAndPay;
    }
}
