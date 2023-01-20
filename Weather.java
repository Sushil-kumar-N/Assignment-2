import java.util.*;

     class Weather {

     public static void main(String args[]) {

     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the temperature: ");

     int temp=scanner.nextInt();
     String climate="";
     if(temp<0)
     climate="Freezing ";

     else if(temp>=21&&temp<=30)
     climate="Normal ";

     else if(temp>=31&&temp<=40)
     climate="Hot ";

     else if(temp>40)
     climate="Very hot ";

     System.out.println(climate+ "weather.");
}
}