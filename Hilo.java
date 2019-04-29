import java.util.Scanner;
import java.text.NumberFormat;
import java.lang.Math;
import java.lang.String;
public class Hilo{
   public static void hilo(int points, String playerA, String playerB) {
       int b;
       int c;
       int num;
       int numb;
       int risk;
       int predict;
       int riskb;
       int predictb;
       int pointb;
       int guess=0;
       String replay=  "y";
       Scanner input = new Scanner(System.in);
       pointb=points;
       do{
           num=0;
           numb=0;
           risk =0;
           riskb =0;
           b=0;
           c=0;
           if(points < 100){
           risk=points;
           System.out.print(playerA +" risk: " +risk);
        }else{
           while(risk <= 99 || risk > points){
       System.out.print(playerA +" enter points to risk(min 100): ");
       risk = input.nextInt();
    }
}   
           if(pointb < 100){
           riskb=pointb;
           System.out.print(playerB +" risk: " +riskb);
        }else{
            while(riskb <= 99 || riskb > pointb){
       System.out.print(playerB +" enter points to risk(min 100): ");
       riskb = input.nextInt();
    }
}
       System.out.println();
       System.out.print(playerA +" predict (1=High, 0=Low)= ");
       predict = input.nextInt();
       System.out.print(playerB +" predict (1=High, 0=Low)= ");
       predictb = input.nextInt();
       if(playerA.equals("E")){
           
           if(predictb==0){
           numb = (int)(7* Math.random()+7);}
           else if(predictb==1){
               numb = (int)(7* Math.random()+1);
            }
        }else if(playerB.equals("E")){
           
           if(predict==0){
           num = (int)(7* Math.random()+7);}
           else if(predict==1){
               num = (int)(7* Math.random()+1);
            }
        }
        if(playerA.equals("J")){
           
           if(predict==1){
           num = (int)(6* Math.random()+8);}
           else if(predict==0){
               num = (int)(7* Math.random()+1);
            }
        }else if(playerB.equals("J")){
           
           if(predictb==1){
           numb = (int)(6* Math.random()+8);}
           else if(predictb==0){
               numb = (int)(6* Math.random()+1);
            }
        }
        if(num==0 && numb==0){
       num = (int)(13* Math.random()+1);
       numb = (int)(13* Math.random()+1);
       
    }else if(num==0){
        num = (int)(13* Math.random()+1);
    }else if(numb==0){
        numb = (int)(13* Math.random()+1);
    }
    
       System.out.println("Number for " +playerA +" is " + num);
       System.out.println("Number for " +playerB +" is " + numb);
       if((1 == predict && 8 <= num && num <= 13)||(0 == predict && 1 <= num && num <= 6)){
           System.out.println(playerA +": You win round.");
           points= points + (risk * 2);
           }else{points= points - risk;
               if (pointb > 0)
            System.out.println(playerA +":You lose round.");
            else{
               System.out.println(playerA +":You lose."); 
            }
        } 
        if((1 == predictb && 8 <= numb && numb <= 13)||(0 == predictb && 1 <= numb && numb <= 6)){
           System.out.println(playerB +": You win round.");
           pointb= pointb + (riskb * 2);
           }else {
               pointb= pointb - riskb;
               if (pointb > 0)
            System.out.println(playerB +":You lose round.");
            else{
               System.out.println(playerB +":You lose."); 
            }
        } 
        System.out.print(playerA +" has "+points +"\n");
        System.out.print(playerB +" has "+pointb +"\n");
        if(points == 0 && pointb > 0){
            System.out.print(playerB +" wins!");
        }else if(pointb == 0 && points > 0){
            System.out.print(playerA +" wins!");
        }else{
        }
        System.out.print("Play again?");
        replay = input.next();
        guess = guess +1;
    while(replay.startsWith("y") && c==0){
    if(pointb == 0 || points == 0){
        points = 1000;
        pointb = 1000;
        System.out.print(playerA +" has "+ points +"\n");
        System.out.print(playerB +" has "+ pointb +"\n");
        c+=1;
        System.out.print("Amount time played "+ guess +"\n");
        guess=0;
    }else{
        
        c+=1;
    }
}
    }while(replay.startsWith("y") && (points > 0 || pointb > 0));
    System.out.print("Amount time played "+ guess +"\n");
    while(!replay.startsWith("y") && b ==0){
    if(points > pointb){
        System.out.print(playerA +" wins!");
        b+=1;
        }else if(pointb > points){
            System.out.print(playerB +" wins!");
            b+=1;
        }else if(pointb == points){
        System.out.print("Tied game!");
        b +=1;
    }else{ 
        
            b+=1;
        }
    }
}
        
        
    
            public static void main(String[] args){
                int points= 1000;
                String playerA;
                String playerB;
                Scanner input = new Scanner(System.in);
        System.out.print("High Low Game \n");
        System.out.print("RULES \n");
        System.out.print("Numbers 1 through 6 are low \n");
        System.out.print("Numbers 8 through 13 are high\n");
        System.out.print("Numbers 7 is neither high or low \n");
        System.out.print("\n");
        System.out.print("player 1 enter user name:");
        playerA = input.next();
        System.out.print("player 2 enter user name:");
        playerB = input.next();
        System.out.print(playerA +" has "+ points +"\n");
        System.out.print(playerB +" has "+ points +"\n");
        
            hilo(points, playerA, playerB);
            
        
    }
} 
