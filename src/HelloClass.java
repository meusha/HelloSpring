/**
 * Created by User on 5/1/2017.
 */
public class HelloClass {

    private String message;

    public String getMessage() {
        System.out.println("Your Message is:" +message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
