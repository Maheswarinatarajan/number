public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       String s=str.replaceAll("[aeiouAEIOU]","");
        System.out.println(""+s);
        
        // TODO code application logic here
    }