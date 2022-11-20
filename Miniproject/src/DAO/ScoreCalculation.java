//package DAO;
//
//import java.util.Scanner;
//
//
//public class ScoreCalculation {
//    
//    static int score=0;
//       
//    void scoreupdate(int input)
//    {
//        score = score + input;
//        System.out.println("Updated Score:"+score);
//    }
//
//    public int getScore() {
//        
//        return score;
//    }
//    
//    
//    void matchCalculation(){ 
//        ScoreCalculation a = new ScoreCalculation();
//        int i,j;
//       ScoreDetails sd = new ScoreDetails();
//       
//        int overs = sd.getTotalOvers();
//        
//        for(i=0;i<overs;i++)
//        {
//            int balls=6;
//            for(j=1;j<=balls;j++){
////            System.out.println("Enetr the runs in this ball:"+i+"."+j);
//            String input =  
//            
//               if(input.equalsIgnoreCase("wide")) {
//                   a.scoreupdate(1);
//                   System.out.println("Enter the extra run with wide:");
//                   input=sc.next();
//                   a.scoreupdate(Integer.parseInt(input));
//                   j--;
//               }
//               else if(input.equalsIgnoreCase("no ball")){
//                   a.scoreupdate(1);
//                   System.out.println("Enter the extra run with no ball:");
//                   sc.next();
//                   input=sc.next();
//                   a.scoreupdate(Integer.parseInt(input));
//                   j--;
//               }else if(input.equalsIgnoreCase("wicket")){
//                   a.scoreupdate(0);
//                   j--;
//               }else{
//                   a.scoreupdate(Integer.parseInt(input));
//               }
//           }
//       }  
//    }
//}
