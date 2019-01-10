import java.util.logging.Level;

public class StringField extends Field {

    private String value;

    /**
     * @param name The name of the field
     * @param val The value to set it to
     */
    public StringField(String name, String val, Level level) {
        super(name, level);
        value = val;
    }

    /**
     * @return The string the field contains.
     */
    public String toString() {
        return value;
    }
    
    /**
     * Changes the current value
     * @param val The new value to set
     */
    public void setValue(String val) {
        value = val;
    }
}
