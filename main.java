package computer.networking.lab;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    
    public static void main (String [] args) throws IOException{
      Socket s = new Socket("localhost", 4500);
      
      System.out.println("Connected");
      
    
       DataInputStream input = new DataInputStream(s.getInputStream());
      DataOutputStream output = new DataOutputStream(s.getOutputStream());
      
      Scanner scn = new Scanner (System.in);
      
      String str = "";
      
     while(!str.equals("Bye")){
     
         str = scn.nextLine();
         output.writeUTF(str);
        
            str = input.readUTF();
    System.out.println("Client Says :" +str );
    
     }
     output.close();
     s.close();
      
     
     
    }
    
    
    
}
