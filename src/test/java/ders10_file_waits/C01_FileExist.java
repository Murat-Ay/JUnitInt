package ders10_file_waits;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_FileExist {
    @Test
    public void test01(){
        System.out.println(System.getProperty("user.dir"));
        String dosyaYolu = System.getProperty( "user.home" ) + "/Win/Desktop/FileTesti/deneme.txt";

        System.out.println( "dosyaYolu" );
        System.out.println(Files.exists(Paths.get(dosyaYolu)));
    }}

//C:\Users\Win\Desktop\FileTesti