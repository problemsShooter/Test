package exceptions.auxiliaryExcTask5;

public class BaseA {
    public void method(){
        try{
            throw new Exception1("exception1");
        }catch(Exception1 e){
            e.printInfo();
        }
    }
}
