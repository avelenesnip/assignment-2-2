import java.util.Scanner;

class GradeBot {

    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double points = 0, percentage = 0, numberofquestions;
        
        
        System.out.print ("Enter the number of questions:");
        numberofquestions = sc.nextDouble();
        
        
        System.out.print ("Enter the number of questions you got correct:");
        points = sc.nextDouble();
    
        percentage =  (points/numberofquestions) * 100;
        
        percentage = (int)percentage;
        
        System.out.print (percentage +"%- ");
     
        if (percentage >= 0 && percentage <=49){
          
            System.out.print ("49-0: F");
            
        } else if (percentage >= 50 && percentage <=59){
            
            System.out.print ("59-50: C-  Don't cry you can do better next time!");
            
        } else if (60 <= percentage && percentage <=66){
            
            System.out.print ("66-60: C  Too bad you really thought you did okay didnt you? lol.");
        
        } else if (percentage >= 67 && percentage <=72){
            
            System.out.print ("72-67: C+  Not the worse |:");
            
        } else if (percentage >= 73 && percentage <=85){
            
            System.out.print ("85-73: B  Hey, you didn't fail!");
            
        } else if (percentage >= 86 && percentage <=100){
            
            System.out.print ("100-86: A  Noice (;");
            
        } else{
           
            System.out.print ("Invalid Grade");
            
        }
        
        }
    }
