/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learn.java.iostreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author gopinath
 */
public class FileOutputStreamDemo {
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String details="Hi welcome to pondicherry";
        FileOutputStream fos=new FileOutputStream("/Users/gopinath/Documents/gopinath/enjoy.txt");
        byte[] dataBytes=details.getBytes();
        fos.write(dataBytes);
        fos.flush();
        fos.close();
        
    }
    
}
