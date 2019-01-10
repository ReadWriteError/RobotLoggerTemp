import java.text.DecimalFormat;
import java.util.logging.Level;

public class DoubleField extends Field {

    private double value;

    //Changes how the decimal is formatted as a string.
    private static final DecimalFormat df = new DecimalFormat("#.00"); 

    /**
     * Create a new double field with the name name and the value val
     * @param name The name of the field
     * @param val The value to set it to.
     */
    public DoubleField(String name, double val, Level level) {
        super(name, level);
        value = val;
    }
    /**
     * Returns a formatted decimal
     * @return The formatted decimal.
     */
    public String toString() {
        return df.format(value);
    }
}