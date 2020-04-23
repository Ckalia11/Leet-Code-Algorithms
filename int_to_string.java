public class Main
{
    
    public static void ones(Integer n) {
        
        if(n == 1) {
            System.out.println("One");
            
        }
        
        else if(n == 2) {
            System.out.println("Two");
            
        }
        
        else if(n == 3) {
            System.out.println("Three");        
        }
        
        else if(n == 4) {
            System.out.println("Four");
        }
        
        else if(n == 5) {
            System.out.println("Five");
        }
        
        else if(n == 6) {
            System.out.println("Six");
        }
        
        else if(n == 7) {
            System.out.println("Seven");
        }
        
        else if(n == 8) {
            System.out.println("Eight");
        }
        
        else if(n == 9) {
            System.out.println("Nine");
        }
        
        else {
            System.out.println("");
        }
        
    }
    
    public static void not_teens(Integer n) {
        
        if(n == 0) {
            System.out.println("Ten");
        }
        
        else if(n == 1 ) {
            System.out.println("Eleven");
        }
        else if(n == 2) {
            System.out.println("Twelve");
        }
        else if(n == 3) {
            System.out.println("Thirteen");
        }
        else if(n == 5) {
            System.out.println("Fifteen");
        }
        
        else {
            System.out.println("");
        }
    }
    
    public static void tens(Integer n) {
        if(n == 2) {
            System.out.println("Twenty");
            
        }
        
        else if(n == 3) {
            System.out.println("Thirty");
            
        }
        
        else if(n == 4) {
            System.out.println("Fourty");        
        }
        
        else if(n == 5) {
            System.out.println("Fifty");
        }
        
        else if(n == 6) {
            System.out.println("Sixty");
        }
        
        else if(n == 7) {
            System.out.println("Seventy");
        }
        
        else if(n == 8) {
            System.out.println("Eighty");
        }
        
        else if(n == 9) {
            System.out.println("Ninety");
        }
        
        else {
            System.out.println("");
        }
    }
    
    public static void print() {
        
    }
	
	public static void main(String[] args) {
		
		Integer number = 343;
        Integer ones = number % 10;
        Integer tens = (number % 100) / 10;
        Integer hundreds = (number /100);
        
        
        if(hundreds == 0) {
        }
        
        else {
            ones(hundreds);
            System.out.println("Hundred");
        }
        
        if( (tens == 1) && ( (ones!= 1) && (ones!= 2) && (ones!=3) && (ones!=5) ) ) {
            ones(ones);
            System.out.println("teen");
            
        }
        
        else if( (tens == 1) && ( (ones == 1) || (ones == 2) || (ones == 3) || (ones == 5) ) ) {
            not_teens(ones);
        }
        
        else{
        tens(tens);
        ones(ones);  
        }
        
       
        
        
        
	}
}