   public static void main(String[] args) {
        System.out.println("enter the letter");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if((c>='a'&& c<='z')||(c>='A'&& c<='Z'))
        {
            System.out.println("alphabet");}
            else{
            System.out.println("not alphabet");
        }
        // TODO code application logic here
    }
}
