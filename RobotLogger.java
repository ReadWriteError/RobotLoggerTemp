import java.util.logging.*;

public class RobotLogger {

    private Logger mainLogger = Logger.getLogger(RobotLogger.class.getName());

    /**
     * Flushes all logged updates to a file.
     */
    public void flush() {
        
    }

    private void createRawEntry(String message, Level messageLevel) 
    {
        mainLogger.log(messageLevel, "[" + getTimestampString() + "]" + message);
    }
    //XXX - Should return the match time, not epoch time.
    private String getTimestampString() {
        return Long.toString(System.currentTimeMillis());
    }
    /**
     * Logs a raw message to the console
     * @param message The message to log
     * @param messageLevel The level of the message to log.
     */
    public void logMessage(String message, Level messageLevel) {
        createRawEntry("[MESSAGE] " + message, messageLevel);
    }

    /**
     * Sets the level of messages to be logged.
     * @param newLevel The level in question.
     */
    public void setLevel(Level newLevel) {
        mainLogger.setLevel(newLevel);
    }

}