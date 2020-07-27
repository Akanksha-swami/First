package amdocs;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regularexp 
{
    public static void main(String[] args) 
    {
        try 
        {
            String email = "akankshaswami1999@gmail.com";
            String email1="123";
            String emailregex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
            Boolean a = email.matches(emailregex);
            Boolean b = email1.matches(emailregex);
            System.out.println("First mail address (akankshaswami1999@gmail.com)");
            if (a == false) 
            {
                System.out.println("Email Address is Invalid");
            }
            else if(a == true)
            {
                System.out.println("Email Address is Valid");
            }
            System.out.println();
            System.out.println("Second mail address (123)");
            if (b == false) 
            {
                System.out.println("Email Address is Invalid");
            }
            else if(b == true)
            {
                System.out.println("Email Address is Valid");
            }
        }
        catch (Exception e) 
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
/*
 * Output:
 * First mail address (akankshaswami1999@gmail.com)
Email Address is Valid

Second mail address (123)
Email Address is Invalid
BUILD SUCCESSFUL (total time: 0 seconds)
 */