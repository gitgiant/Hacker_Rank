import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int saveThePrisoner(int n, int m, int s) {
        if((s-1 + m)% n==0)
            return n;
        else
            return (s-1 + m)% n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] result = new int[t];
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            result[a0] = saveThePrisoner(n, m, s);
        }
        for (int a0 = 0; a0 < t; a0++) {
            System.out.println(result[a0]);
        }
    }
}
