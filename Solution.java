import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int liked = 0;
        int disliked = 0;
        double sent = 5;
        int total = 0;
        for(int i = 0; i < n; i ++ ){
            liked = (int) Math.floor(sent/2);
            sent = liked * 3;
            total += liked;
        }
        System.out.println(total);
    }
}
