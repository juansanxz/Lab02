package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        if (args.length != 0) {
            String sentence = "Hello ";
            for (int i = 0; i < args.length; i++) {
                sentence += args[i];
                sentence += " ";
            }
            sentence += "!";
            System.out.println(sentence);
        } else {
            System.out.println( "Hello World!");
        }
    }
}
