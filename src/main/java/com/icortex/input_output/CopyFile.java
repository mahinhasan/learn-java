package com.icortex.input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) {
        int i;
        if(args.length != 2){
            System.out.println("Usage: CopyFile from to");
            return;
        }

        try (FileInputStream file = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1])
        ){
            do{
                i = file.read();
                if(i != -1){
                    fout.write(i);
                }
            }while (i!= -1);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
