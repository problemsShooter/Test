package exceptions.auxiliaryExcTask5;

public class BaseC extends BaseB{
    @Override
    public void method() {
        try{
            throw new Exception3("exception3");
        }catch(Exception3 e){
            System.out.print("we are in BaseC ");
            e.printInfo();
        }
    }
}
