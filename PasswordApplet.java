import java.applet.Applet;
import java.awt.Graphics;

public class PasswordApplet extends Applet {
    private String username;
    private String password;

    public void init() {
        username = getParameter("username");
        password = getParameter("password");

        boolean isPasswordValid = (password != null && password.length() > 8);

        if (isPasswordValid) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid. Please provide a password with more than 8 characters.");
        }
    }
}