import java.util.logging.*;
import java.util.HashMap;


public class RobotLogger {

    private Logger mainLogger = Logger.getLogger(RobotLogger.class.getName());

    private HashMap<String, Field> itemMap = new HashMap<>();
    /**
     * Accesses the raw logger and makes a statement with a timestamp.
     * @param message The message to log
     * @param messageLevel The level of the message to log.
     */
    
    /**
     * Logs a message to the log
     * @param message The message to log
     * @param messageLevel The level of the message to log.
     */
    public void logMessage(String message, Level messageLevel) {
        mainLogger.log(messageLevel,message);
    }

    /**
     * Adds a handler to the logger.
     * @param h The handler to be added.
     */
    public void addHandler(Handler h) {
        mainLogger.addHandler(h);
    }
    /**
     * Sets the level of messages to be logged.
     * @param newLevel The level in question.
     */
    public void setLevel(Level newLevel) {
        mainLogger.setLevel(newLevel);
    }

    /**
     * Adds a field of any type to the logger.
     * @param f The field to log.
     */
    public void createField(Field f) {
        itemMap.put(f.getName(), f);
    }

    /**
     * Creates or changes a new double field
     * @param name The name of the field
     * @param value The initial value of the field
     * @param level The priority of the field
     */
    public void createDoubleField(String name, Level level) {
        itemMap.put(name, new DoubleField(name, 0.0, level));
    }

    /**
     * Creates or changes a new boolean field
     * @param name The name of the field
     * @param value The initial value of the field
     * @param level The priority of the field
     * @param message 
     */
    public void createBoolField(String name,  Level level) {
        itemMap.put(name, new BooleanField(name, false, level));
    }

    /**
     * Creates or changes a new integer field
     * @param name The name of the field
     * @param value The initial value of the field
     * @param level The priority of the field
     */
    public void createIntegerField(String name, Level level) {
        itemMap.put(name, new IntegerField(name, 0, level));
    }

    /**
     * Creates or changes a new String field
     * @param name The name of the field
     * @param value The initial value of the field
     * @param level The priority of the field
     */
    public void createStringField(String name, Level level) {
        itemMap.put(name, new StringField(name, "", level));
    }

    public void setDoubleField(String name, double value, String message) {
        Field f = itemMap.get(name);
        if (f instanceof DoubleField) {
            DoubleField df = (DoubleField)f;
            
        }
    }
    /**
     * Flushes all logged updates to a file.
     */
    public void flush() {

    }
}