import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String urlbar = in.nextLine();
        if(urlbar.contains("."))
        {
            System.out.println("http://"+urlbar);
        }
        else if(urlbar.contains("http://")||urlbar.contains("ftp://")||urlbar.contains("https://"))
        {
             System.out.println(urlbar);
        }
        else
        {
            System.out.println("ftp://"+urlbar);
        }
    }
}
