import java.util.Scanner;

public class Main {

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        s=s+',';
        int count=0;
        String arr[]=new String[1000];
        String str="";
        for(int i=0; i<s.length(); i++)
        { 
        char c=s.charAt(i);
            if(c!=',')
            str=str+c;
            else 
            {arr[count++]=str;
            str="";}
        }
        
        for(int i=0; i< count; i++){
        if (is_Valid_Password(arr[i])) {
            System.out.println(arr[i]+"Success ");
        }
}

    }

    public static boolean is_Valid_Password(String password) {

        if (password.length() < 6)
        { System.out.print(password+" Failure Password must be atleast six characters long \n");
          return false;}
          else if (password.length() > 12)
        { System.out.print(password+" Failure Password must be at max 12 characters long \n");
          return false;}

        int upperCount = 0, numCount = 0, lowerCount = 0, specCount=0,specnotCount=0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);
 
            if ('a' <= ch && ch <= 'z') 
            lowerCount++;
            else if ('A' <= ch && ch <= 'Z')
            upperCount++;
            else if ('0' <= ch && ch <= '9') 
            numCount++;
            else if (ch=='*' || ch=='$' || ch=='_' || ch=='#' || ch=='=' ||ch=='@') 
            specCount++;
            else if (ch=='%' || ch=='!' || ch==')' || ch=='(' ) 
            specnotCount++;
        }
if(lowerCount==0)
{System.out.print(password+" Failure Password must contain at least one letter from <a-z> \n");
          return false;
}
if(upperCount==0)
{System.out.print(password+" Failure Password must contain at least one letter from <A-Z> \n");
          return false;
}
if(numCount==0)
{System.out.print(password+" Failure Password must contain at least one letter from <0-9> \n");
          return false;}
         
if(specCount==0)
{System.out.print(password+" Failure Password must contain at least one letter from <[*$_#=@> \n");
          return false;
}
 if(specnotCount!=0)
{System.out.print(password+" Failure Password cannot contain %!)( \n");
          return false;}

else return true;


}}

