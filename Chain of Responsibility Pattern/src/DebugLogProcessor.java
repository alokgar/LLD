public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }
    @Override
    public void log(String logType, String payload) {
        if(logType == "debug"){
            System.out.println("debug : " + payload);
            return;
        }
        else{
            nextLog(logType, payload);
        }
    }
}
