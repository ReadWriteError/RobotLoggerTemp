import java.util.logging.Level;

public class Field {
    
    private String name; 

    private Level fieldLevel = Level.INFO;

    protected Field(String name_, Level level) 
    {
        name = name_;
        fieldLevel = level;
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

    public final Level getLevel() {
        return fieldLevel;
    }

}
