
package filetransfer;

import  java.io.*;
import java.net.*;


public class Client {
    
     public static void main(String[] args) throws Exception {
        
         byte [] b = new byte[20002];
         Socket sr = new Socket("localhost",1453);
         InputStream is= sr.getInputStream();
         FileOutputStream fr=new FileOutputStream("D:\\FileTransferTest\\Client\\YeniMetinBelgesi.txt");// Serverden alınan dosyanın kaydedilcek yeri.
         is.read(b,0,b.length);
         fr.write(b,0,b.length);
    }
     
}
