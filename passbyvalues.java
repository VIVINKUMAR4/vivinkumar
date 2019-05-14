class passbyvalue{
int number;
void swap(int n1,int n2){
int n3=n1;
n1=n2;
n2=n3; 
System.out.println("a=" +n1);
System.out.println("b=" +n2);
}
}
public class passbyvalues{
public static void main(String[] args){
passbyvalue p=new passbyvalue();
int a=5;
int b=6;
p.swap(a,b);
}
}