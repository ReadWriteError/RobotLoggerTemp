
public class DoubleField extends Field {

    private double value;

    /**
     * Create a new double field with the name name and the value val
     * @param name The name of the field
     * @param val The value to set it to.
     */
    public DoubleField(String name, double val) {
        super(name);
        value = val;
    }
}