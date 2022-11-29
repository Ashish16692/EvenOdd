import java.util.Scanner;
public class evenodd {
    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);

        System.out.print("enter the first number:");
        int num=scanner.nextInt();
 
        
        //System.out.print("enter the second number:");
        //int second= scanner.nextInt();

       // if(num %2==0){
       //     System.out.println(" number is even::");
       // }

        //else{
          //  System.out.println(" number is odd:");
        //}

        if((num & 1)==0){
              System.out.println(" number is even::");
        }
          else{
                 System.out.println(" number is odd:");
                 }       
      scanner.close();
    
    
    }
}


