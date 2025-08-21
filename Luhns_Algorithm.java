import java.util.*;
class Luhns_Algorithm {
    public static void main(String[] args) {
        
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter the card number w/o space: ");
        String cardnum=s1.nextLine();
        
        
         // Remove spaces from input (important!)
        // cardnum = cardnum.replaceAll("\\s", "");
        
        //Example String cardnum ="4539 1488 0343 6467";
        //int checkdigit=n-1;
        
        int n=cardnum.length();
        int sum=0;
        boolean doubledigit=false;
        
        for(int i=n-1;i>=0;i--){
            int digit=cardnum.charAt(i)-'0';
            
            if(doubledigit==true){
                digit=digit*2;
                
                if (digit>9){
                    digit=digit-9;
                }
            }
            
            doubledigit=!doubledigit;
            
            sum=sum+digit;
        }
        
        if (sum % 10 == 0) {
            System.out.println("Card number is VALID");
        } 
        else {
            System.out.println("Card number is INVALID");
        }
        
        s1.close();
    }
}