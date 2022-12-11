/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.compressor to edit this template
 */
package compressor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author shaik
 */
public class compressor {
    public static void method(File file) throws IOException{
        
        String filedirectory=file.getParent();
        //get parent get the address of the parent directory
        
        //take input bytes from the file
        FileInputStream fis=new FileInputStream(file);
        //writing the output bytes again
        FileOutputStream fos=new FileOutputStream(filedirectory+"/Compressed1.gz");
        GZIPOutputStream gzip=new GZIPOutputStream(fos);
        //you can modify the size of byte array according to the input file
        byte[] buffer=new byte[1024];
        //len is basically responsible for reading the whole file
        int len;
        //len=-1 
        while((len=fis.read(buffer))!=-1)
        {
            gzip.write(buffer,0,len);
        }
        gzip.close();
        fos.close();
        fis.close();
    
    }
    
    public static void main(String[] args) throws IOException{
        File path=new File("/Users/shaik/Downloads/testfile.txt");
        method(path);
    }
}
