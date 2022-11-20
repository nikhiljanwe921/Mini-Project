package DAO;

import java.util.Random;

public class TossFunction {
    Random ran = new Random();
        int a = ran.nextInt(2);

    public boolean checkToss(String farmeChoice) {
//        System.out.println("A:"+this.a);
        String choice;
        if(this.a == 1){
            choice = "Head";
        }else{
            choice = "Tail";
        }
        
        if(choice.equals(farmeChoice)){
            return true;
        }else{
            return false;
        }
    }
}
