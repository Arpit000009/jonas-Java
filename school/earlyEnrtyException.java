package school;

public class earlyEnrtyException extends RuntimeException{
    
    @Override
    public String getMessage(){
        return "you are early";
    }
}
