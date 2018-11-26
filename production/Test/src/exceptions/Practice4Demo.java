package exceptions;

import exceptions.auxiliaryExcTask4.CustomException1;
import exceptions.auxiliaryExcTask4.CustomException2;
import exceptions.auxiliaryExcTask4.CustomException3;

public class Practice4Demo {

    public static void caughtExceptions() throws CustomException3 {
        try {
            throw new CustomException1("new Custom Exception1");
        } catch (CustomException1 e) {
            System.out.println("caught " + e.getText());
        }
        try {
            throw new CustomException2("new Custom Exception2");

        } catch (CustomException2 e) {
            System.out.println("caught " + e.getText());
            try {
                throw new CustomException3("new Custom Exception3");
            } catch (CustomException3 r) {
                System.out.println("caught " + r.getText());
            }
        }
    }

    public static void main(String[] args){
        Practice4Demo.caughtExceptions();
    }
}
