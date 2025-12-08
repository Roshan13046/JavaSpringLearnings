package LLD_Sytem_Design.ChainOfResponsibilityLoggingSystem;

public class InfoLogProcessor extends LogProcessor{

    InfoLogProcessor(int level, LogProcessor nextLogProcessor) {
        this.level = level;
        this.nextLogProcessor = nextLogProcessor;
    }

    @Override
    public void processLog(String message) {
        System.out.println("Info Logs: " + message);
    }
}
