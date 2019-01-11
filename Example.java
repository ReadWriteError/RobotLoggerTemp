import java.util.logging.Level;
import java.util.logging.ConsoleHandler;

public class Example {
    public static void main(String[] args) {
        RobotLogger rl = new RobotLogger();
        //rl.addHandler(new ConsoleHandler());
        rl.createStringField("TestField", Level.SEVERE);
        rl.setLevel(Level.ALL);
        rl.setStringField("TestField", "Garbonzo Beans");
        rl.setStringField("TestField", "Black Beans");
        rl.logMessage("This is a custom message", Level.INFO);
    }
}