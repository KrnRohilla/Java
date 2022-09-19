// Basic 
package strings;
import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // String name = scn.next();
        // System.out.println("your name is "+ name);

        // concatenation 

        // String firstName ="karan";
        // String secondName ="Rohilla";
        // String fullName = firstName + secondName;
        // System.out.println(fullName);
        
        // length 

        // String firstName ="karan";
        // String secondName ="Rohilla";
        //  String fullName = firstName + secondName;
        //  System.out.println(fullName.length());

        //  charAt
        //  for(int i=0;i<fullName.length();i++){
        //     System.out.println(fullName.charAt(i));
        //  }

        // compare 
        String name1 = "ravi";
        String name2 = "singh";
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

    }
}
