public static void main(String[] args) {
        System.out.println("enter the no");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem;
          int result=0;
        while(n>0){
            rem=n%10;
            n=n/10;
            result=result*10+rem;
        }
            System.out.println(""+result);
            
        }
                
        // TODO code application logic here
    }

