import java.util.Scanner;

class Magic8ball {
 
    public static void main ( String [] args) {
        
        Scanner sc = new Scanner(System.in);
        int d1 = 0;
        String question   = ""; 
        
        System.out.print ("Enter a yes or no question:");
        question = sc.next();
       
        
        d1 = (int) (Math.random()*20) +1;
       
        
     if (d1==1){
        System.out.println("Yes."); 
    }else if (d1==1){
        System.out.println("No."); 
    }else if (d1==2){
        System.out.println("For sure!"); 
    }else if (d1==3){
        System.out.println("It is a possibility."); 
    }else if (d1==4){
        System.out.println("Your best friends knows the answer to this, ask them!"); 
    }else if (d1==5){
        System.out.println("Never"); 
    }else if (d1==6){
        System.out.println("You already know the answer to this, you just have to admit it to yourself. You need to."); 
    }else if (d1==7){
        System.out.println("Of Course"); 
    }else if (d1==8){  
        System.out.println("Noooooooo.");     
    }else if (d1==9){
        System.out.println("No Way."); 
    }else if (d1==10){
        System.out.println("Nope!"); 
    }else if (d1==11){
        System.out.println("There is no answer in the world to the question you just asked."); 
    }else if (d1==12){
        System.out.println("umm, uhh, noo?"); 
    }else if (d1==13){
        System.out.println("What a question! Ha. No."); 
    }else if (d1==14){
        System.out.println("The cards are in favor of this."); 
    }else if (d1==15){
        System.out.println("Of Course NOT"); 
    }else if (d1==16){  
        System.out.println("Noooooooo.");
    }else if (d1==17){
        System.out.println("What is the opposite of yes?"); 
    }else if (d1==18){
        System.out.println("HAHAHAHAAHA. Yep. Probably."); 
    }else if (d1==19){
        System.out.println("It is likely not a possibility."); 
    }else if (d1==20){
        System.out.println("Your worst enemy knows the answer to this, ask them!"); 
    }else{
        System.out.println("Yeah. Duh."); 
    } 
       
}
    
}
