public class StringField extends Field {

    private String value;

    /**
     * @param name The name of the field
     * @param val The value to set it to
     */
    public StringField(String name, String val) {
        super(name);
        value = val;
    }

    /**
     * @return The string the field contains.
     */
    public String toString() {
        return value;
    }


}