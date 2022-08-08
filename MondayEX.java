package week2.monday;

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.io.*;
import java.util.*;

public class MondayEX {
    public static void main(String[] args){
        //Create String Array
        String comp[] = {"dell", "lenovo", "macbook", "chromebook", "hp", "asus", "acer",
                              "razer", "microsoft", "lg"};
        // declare i for the loop (nothing special)
        int i = 0;
        // make a loop to print out the Array

        while(i<10){
            //using StringBuffer method to convert String into new StringBuffer then reverse it. Then Print

            StringBuffer sbr = new StringBuffer(comp[i]);
            sbr.reverse();
            System.out.println(sbr);
            i++;

            }

        }





    }
















