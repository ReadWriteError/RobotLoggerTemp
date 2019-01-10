public class BooleanField extends Field {

    private boolean value;

    public BooleanField(String name, boolean val) {
        super(name);
        value = val;
    }

    /**
     * @return The value of the boolean as a string.
     */
    public String toString() {
        return Boolean.toString(value);
    }
}