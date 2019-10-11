    public class ParameterPassing1 {
       public static void main(String[] args) {
         int num1, num2;
         num1 = 10;
         num2 = 20;
      
         System.out.println("Before swap - num1: "+num1+", num2: "+num2); 
         swap (num1, num2);
         System.out.println("After swap - num1: "+num1+", num2: "+num2);
      }
   
       public static void swap (int a, int b) {
         int temp;
      
         System.out.println("Inside swap (start) - a: "+ a+",b: "+b);
         temp = a;
         a = b;
         b = temp;
         System.out.println("Inside swap (end) - a: "+ a+",b: "+b);
      }
   }