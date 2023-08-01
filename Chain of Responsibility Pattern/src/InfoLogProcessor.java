public class InfoLogProcessor extends LogProcessor {
    public InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }
    @Override
    public void log(String logType, String payload) {
        if(logType == "info"){
            System.out.println("info : " + payload);
        }
        else{
            nextLog(logType, payload);
        }
    }
}
