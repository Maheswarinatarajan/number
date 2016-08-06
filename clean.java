package instanceofjava;
class ConstructorChaining{
int a,b 
ConstructorChaining(){
this(1,2);
 System.out.println("Default constructor");
 
} 
 
ConstructorChaining(int x , int y){
 
this(1,2,3); 
a=x;
b=y;
 System.out.println("Two argument constructor");
 
}
 
ConstructorChaining(int a , int b,int c){
 System.out.println("Three argument constructor")
} 
 
public static void main(String[] args){
 
 ConstructorChaining obj=new ConstructorChaining();
  System.out.println(obj.a);
  System.out.println(obj.b);
 
} 