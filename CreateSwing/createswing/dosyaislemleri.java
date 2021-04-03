/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createswing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author melikekecelioglu
 */
public class dosyaislemleri {

    public static void DosyaYaz(String veri) throws FileNotFoundException {
        File file = new File("/Users/melikekecelioglu/Desktop/bilgiler.txt");
        try {
            try ( //FileOutputStream dosya = new FileOutputStream(file);
            //gördüğün gibi bu alt satırda yaptığın şey ile dosyadaki veri korunmuş oluyor.
                    FileOutputStream dosya = new FileOutputStream(file,true)) {
                dosya.write(veri.getBytes());
                dosya.flush();
            }
        } catch (IOException e) {
        }
    }



    public static void DosyaOku() throws FileNotFoundException {
        File file = new File("/Users/melikekecelioglu/Desktop/bilgiler.txt");
        try {
            try (Scanner s = new Scanner(file)) {
                while (s.hasNextLine()) {
                    System.out.println(s.nextLine());
                }
            }
        }catch(FileNotFoundException e) {
        }

    }
    public static void main(String[] args) throws FileNotFoundException {
        DosyaYaz("evde kalacağız ama geleceğim muhteşem olacak");
        DosyaOku();
    }

}
