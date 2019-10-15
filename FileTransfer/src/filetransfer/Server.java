
package filetransfer;

import  java.io.*;
import java.net.*;


public class Server {
    
    public static void main(String[] args) throws Exception {
        ServerSocket s = new ServerSocket(1453);
        Socket sr=s.accept();
        FileInputStream fr = new FileInputStream("D:\\FileTransferTest\\Server\\MetinBelgesi.txt");//Dosya Urlsi buraya yazılacak.
        byte b[] = new byte[20002];
        fr.read(b,0,b.length);
        OutputStream os= sr.getOutputStream();  
        os.write(b,0,b.length);
        
         
    }
    
}
