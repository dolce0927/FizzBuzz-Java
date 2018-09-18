import java.util.Scanner;
public class Fizz_Buzz
{
  public static void main(String[] args)
  {
    for(int i = 1; i <= 100; i++)
     
      if(i % 3 ==0 && i % 5 ==0) 
      {       
        System.out.println("");
        System.out.println("FizzBuzz" + i);
      }  

      
      else 
        if(i % 3 == 0)  {
          System.out.println("");      
          System.out.println("Fizz" + i);
      }    

      
      else
        if(i % 5 == 0) { 
          System.out.println("");        
          System.out.println("Buzz" + i);
      }    

      
      else {  
          System.out.println("");       
          System.out.println(i);
      }      
  }
}
