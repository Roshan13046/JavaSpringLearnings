package LLD_Sytem_Design.ChainOfResponsibilityLoggingSystem;

public abstract class LogProcessor {
    public static final  int DEBUG = 1;
    public static final int INFO = 2;
    public static final int ERROR = 3;
    public static final int FATAL = 4;

    int level;
    LogProcessor nextLogProcessor;

    public void logMessage(int level, String message){
        if(this.level == level){
            processLog(message);
        }

        if(this.nextLogProcessor != null){
            this.nextLogProcessor.logMessage(level, message);
        }
    }

    public abstract void processLog(String message);
}
