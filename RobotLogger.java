import java.util.logging.*;

public class RobotLogger {

    private Logger mainLogger = Logger.getLogger(RobotLogger.class.getName());

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
     * @param h
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
     * Flushes all logged updates to a file.
     */
    public void flush() {

    }
}