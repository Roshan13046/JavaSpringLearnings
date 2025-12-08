package LLD_Sytem_Design.ChainOfResponsibilityLoggingSystem;

public class ErrorLogProcessor extends LogProcessor{

    ErrorLogProcessor(int level, LogProcessor nextLogProcessor) {
        this.level = level;
        this.nextLogProcessor = nextLogProcessor;
    }
    @Override
    public void processLog(String message) {
        System.out.println("Error Log: " + message);
    }
}
