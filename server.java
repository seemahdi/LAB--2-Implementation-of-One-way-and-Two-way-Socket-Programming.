package computer.networking.lab;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class server {
    
    public static void main(String [] args) throws IOException {
    
    ServerSocket ss = new ServerSocket(4500);
    
    System.out.println("Waiting for clients");
         
    Socket s = ss.accept();
    
    System.out.println("Client request is accepted");
    
    
    DataInputStream input = new DataInputStream(s.getInputStream());
    
    DataOutputStream output = new DataOutputStream(s.getOutputStream());
      
      Scanner scn = new Scanner (System.in);
    
    
    String str ="";
    
    while(!str.equals("Bye")){
    
   str = input.readUTF();
    System.out.println("Client Says :" +str );
    
       str = scn.nextLine();
         output.writeUTF(str);
    
    }
      s.close();
      ss.close();
    
    }
    
}
