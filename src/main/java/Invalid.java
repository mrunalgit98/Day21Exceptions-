public class Invalid extends Throwable {
    String errorMessage;

    public Invalid(String message) {
        this.errorMessage=message;
    }
}