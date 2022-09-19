// Write a Java method to count all words in a string ?
public class count {
    public static void main(String[] args) {
        String str="Ha Kar To Die";
        System.out.println(str);
        int c=1;
        int length=str.length();
        for(int i=0;i<length;i++)
        {
          if(str.charAt(i)==' ')
          {
            c++;
          }
        }
        System.out.println("The string contains "+c+ " words");
    } 
}
