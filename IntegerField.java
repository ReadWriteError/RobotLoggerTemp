import java.util.logging.Level;
public class IntegerField extends Field {

    private int value;

    public IntegerField(String name, int val, Level level) {
        super(name, level);
        value = val;
    }

    /**
     * @return The value of the integer as a string.
     */
    public String toString() {
        return Integer.toString(value);
    }
    
    /**
     * Changes the current value
     * @param val The new value to set
     */
    public void setValue(int val) {
        value = val;
    }
}
