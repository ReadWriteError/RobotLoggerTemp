import java.util.logging.Level;
public class BooleanField extends Field {

    private boolean value;

    public BooleanField(String name, boolean val, Level level) {
        super(name, level);
        value = val;
    }

    /**
     * @return The value of the boolean as a string.
     */
    public String toString() {
        return Boolean.toString(value);
    }
}