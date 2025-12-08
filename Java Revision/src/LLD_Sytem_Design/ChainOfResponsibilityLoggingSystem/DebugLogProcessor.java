package LLD_Sytem_Design.ChainOfResponsibilityLoggingSystem;

public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(int level, LogProcessor nextLogProcessor) {
        this.level = level;
        this.nextLogProcessor = nextLogProcessor;
    }

    @Override
    public void processLog(String message) {
        System.out.println("Debug Logs: " + message);
    }
}
