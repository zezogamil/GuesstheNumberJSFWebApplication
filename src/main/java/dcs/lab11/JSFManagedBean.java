import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Random;
import jakarta.annotation.PostConstruct;
import jakarta.faces.annotation.FacesConfig;

@Named(value = "jSFManagedBean")
@SessionScoped
@FacesConfig
public class JSFManagedBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private int secretnum;
    private int userGuess;
    private int attempts = 0;
    private String message = "";
    private final int maxAttempts = 6;
    private boolean gameOver = false;

    @PostConstruct
    public void init() {
        secretnum = new Random().nextInt(100) + 1;
        System.out.println("Secret number is: " + secretnum);
    }

    // Getter and Setter for userGuess
    public int getUserGuess() {
        return userGuess;
    }

    public void setUserGuess(int userGuess) {
        this.userGuess = userGuess;
    }

    // Getter for message
    public String getMessage() {
        return message;
    }

    // Getter for attempts
    public int getAttempts() {
        return attempts;
    }
    public boolean isGameOver(){
        return gameOver;
    }

    public String checkGuess() {
        if (gameOver) {
            return null;
        }

        attempts++;

        if (userGuess == secretnum) {
            message = "Correct!";
            gameOver = true;
        } else if (attempts >= maxAttempts) {
            message = "Game Over! You've used all attempts. The number was " + secretnum + ".";
            gameOver = true;
        } else if (userGuess > secretnum) {
            message = "Too High!";
        } else {
            message = "Too Low!";
        }
        System.out.println("Guess: " + userGuess + ", Attempt: " + attempts + ", Game Over: " + gameOver);
        return null;
    }

    // Optional: Reset method to start over
    public String resetGame() {
        secretnum = new Random().nextInt(100) + 1;
        attempts = 0;
        message = "";
        userGuess = 0;
        gameOver = false;
        System.out.println("New game started. Secret number: " + secretnum);
        return "index";
    }
}
