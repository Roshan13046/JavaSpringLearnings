package LLD_Sytem_Design.ChainOfResponsibilityLoggingSystem;

public class LoggerDemo {
    public static void main(String[] args) {
        LogProcessor errorLogProcessor = new ErrorLogProcessor(LogProcessor.ERROR, null);
        LogProcessor infoLogProcessor = new InfoLogProcessor(LogProcessor.INFO, errorLogProcessor);
        LogProcessor logProcessor = new DebugLogProcessor(LogProcessor.DEBUG,infoLogProcessor );

        logProcessor.logMessage(LogProcessor.DEBUG, " This is debug msg");
        logProcessor.logMessage(LogProcessor.INFO, " This is info msg");
        logProcessor.logMessage(LogProcessor.ERROR, " This is error msg");
    }
}
