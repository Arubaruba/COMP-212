package Ex03;

public class IceCreamConeException extends Exception {

    String message;

    public IceCreamConeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
