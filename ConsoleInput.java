import java.io.Console;
class ConsoleInput{
    public static void main(String args[])
    {    
        Console c=System.console();    
        System.out.println("Enter a String: ");    
        String Str=c.readLine();    
        System.out.println("The String is: "+Str);
}
}
