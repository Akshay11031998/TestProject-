import java.util.regex.*;    
import java.util.*;    
public class EmailValid{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("akshayak@gmail.com");  
        emails.add("abcdefgh@gmail.com");  
        emails.add("ak134@gmail.com");  
        emails.add("venkateshvk@gmail.com");  
        emails.add("akshay@gmail.com");  
        emails.add("rajpatil@gmail.com");  
        //Add invalid emails in list  
        emails.add("@yahoo.com");  
        emails.add("javaTpoint#domain.com");  
        //Regular Expression   
        String regex = "^(.+)@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  
