package com.sagan.javaapp;
import java.util.*;
public class Main {
    public static void main() {
        int i, j, n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        s.close();

        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++) {
                if (i%2!=0) {
                    System.out.print("0");
                } else if (i%2==0){
                    System.out.print("1");
                }
            }
        }
    }
}
