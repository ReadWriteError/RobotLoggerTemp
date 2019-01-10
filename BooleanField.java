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

    /**
     * Changes the current value
     * @param val The new value to set
     */
    public void setValue(boolean val) {
        value = val;
    }
}
