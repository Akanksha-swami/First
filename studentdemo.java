package amdocs;
import java.util.*;
import java.lang.*;
public class studentdemo {
    public static void main(String args[])
    {
        String Firstname,Surname;
        int dd,mm,yyyy;
        Scanner sf=new Scanner(System.in);
        System.out.println("Enter Firstname of student");
        Firstname=sf.nextLine();
        System.out.println("Enter Surname of student");
        Surname=sf.nextLine();
        System.out.println("Enter date of birth(DD/MM/YYYY)");
        dd=sf.nextInt();
        mm=sf.nextInt();
        yyyy=sf.nextInt();
        
        System.out.println("Name:"+Firstname+ "Surname:" +Surname+ "Birthdate:"+dd+"/"+
                mm+"/"+yyyy);
        
        System.out.println("Created StudentId is="+Firstname.charAt(0)+Surname.charAt(0)+String.valueOf(dd));
    }
}

/*output:
Akanksha
Enter Surname of student
Swami
Enter date of birth(DD/MM/YYYY)
21
05
1999
Name:AkankshaSurname:SwamiBirthdate:21/5/1999
Created StudentId is=AS21
* 
* Enter Firstname of student
John
Enter Surname of student
D'Souza
Enter date of birth(DD/MM/YYYY)
10
03
1995
Name:JohnSurname:D'SouzaBirthdate:10/3/1995
Created StudentId is=JD10
 */