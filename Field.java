
public class Field {
    
    private String name; 

    protected Field(String name_) 
    {
        name = name_;
    }
    /**
     * This method is useless.
     * @return Returns a string representation of the field
     */
    public String toString() {
        return "FIELD";
    }

    /**
     * 
     * @return The name of the field.
     */
    public final String getName() {
        return name;
    }

}
