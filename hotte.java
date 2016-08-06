package com.myjava.string;
 
import java.util.StringTokenizer;
 
public class MyStrRemoveMultSpaces {
    public static void main(String a[]){
        String str = "String    With Multiple      Spaces";
        StringTokenizer st = new StringTokenizer(str, " ");
        StringBuffer sb = new StringBuffer();
        while(st.hasMoreElements()){
            sb.append(st.nextElement()).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
- See more at: http://www.java2novice.com/java_string_examples/remove-multiple-spaces/#sthash.4pNTBsye.dpuf