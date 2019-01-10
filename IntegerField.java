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
}
