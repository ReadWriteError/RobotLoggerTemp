public class StringField extends Field {

    public String value;

    /**
     * @param name The name of the field
     * @param val The value to set it to
     */
    public StringField(String name, String val) {
        super(name);
    }

    /**
     * @return The string the field contains.
     */
    public String toString() {
        return value;
    }


}