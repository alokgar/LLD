public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }
    @Override
    public void log(String logType, String payload) {
        if(logType == "error"){
            System.out.println("error : " + payload);
            return;
        }
        else{
            nextLog(logType, payload);
        }
    }
}
