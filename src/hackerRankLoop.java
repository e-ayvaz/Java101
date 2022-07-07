import java.util.*;
import java.io.*;

public class hackerRankLoop {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int result =0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();//0
            int b = in.nextInt();//2
            int n = in.nextInt();//10
            //0 + 2
            //0 + 2 + 4
            //0 + 2 + 4 + 6
            //0 + 2 + 4 + 6 + 8


                for(int j=0;j<n;j++){
                    result =  a + ((int) Math.pow(2,j+1)-1) *b;
                    System.out.print(result+" ");
                }
                System.out.println();

                //0  1   2 4 8 16 32 64 128 256 512 1024 power of 2
                //a*2**j*


        }
        in.close();
    }
}