package com.myjava.string;
 
public class MyStrStartsWith {
 
    public static void main(String a[]){
     
        String str = "This is an example string.";
        System.out.println("Is this string starts with \"This\"? "
                        +str.startsWith("This"));
        System.out.println("Is this string starts with \"is\"? "
                        +str.startsWith("is"));
        System.out.println("Is this string starts with \"is\" after index 5? "
                        +str.startsWith("is", 5));
    }
}
- See more at: http://www.java2novice.com/java_string_examples/starts_with/#sthash.rVH3hRsi.dpuf