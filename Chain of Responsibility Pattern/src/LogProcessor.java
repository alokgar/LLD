public abstract class LogProcessor {
    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor;
    }

    public void nextLog(String logType, String payload){
        nextLogProcessor.log(logType, payload);
    };

    public abstract void log(String logType, String payload);
}
