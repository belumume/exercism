public class LogLevels {
    
    public static String message(String logLine) {
        int colonIndex = logLine.indexOf(":");
        String message = logLine.substring(colonIndex + 1);
        return message.trim();
    }

    public static String logLevel(String logLine) {
        int openBracket = logLine.indexOf("[");
        int closeBracket = logLine.indexOf("]");
        String logLevel = logLine.substring(openBracket + 1, closeBracket);
        return logLevel.toLowerCase();
    }
    
    public static String reformat(String logLine) {
        String message = message(logLine);  
        String logLevel = logLevel(logLine);
        return message + " (" + logLevel + ")";
    }
}
