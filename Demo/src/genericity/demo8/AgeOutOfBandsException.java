package genericity.demo8;

public class AgeOutOfBandsException extends RuntimeException{
    public AgeOutOfBandsException() {
    }

    public AgeOutOfBandsException(String message) {
        super(message);
    }
}
