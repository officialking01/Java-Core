
package io1;

import java.io.*;

public class IO1 {

    public static void main(String[] args) throws IOException {
       int n ;
       char c ;
       System.out.println("Enter a character : ");
       n = System.in.read();
       
       c=(char)n;
        
       System.out.println("Your Entered Character is "+ c);
        
    }
    
}
