import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long j = in.nextLong();
        double k = in.nextDouble();
        int count = 0;
        for(long i = n;i <= j;i++){
            long temp = i;
            long reverse = 0;
            while(temp > 0){
                reverse += (temp % 10);
                temp = temp/10;
                if(temp == 0){break;}
                reverse = reverse * 10;
            }
            //System.out.println(reverse);
            long difference = Math.abs(i-reverse);
            //System.out.println(difference);
            double result = (double)difference/k;
            //System.out.println(result);
            if((result % 1) == 0)
                count++;
        }
        System.out.println(count);
    }
}
