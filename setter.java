class dog{
private int size;
public void setsize(int size){
this.size=size;
}
public void getsize(){
return size;
}
void bark(){
if(size>20)
{
System.out.println("Rufff");
}
else if(size<10)
{
System.out.println("Rpufff");
}
else{
System.out.println("lufff");
}
}
}
public class setter{
public static void main(String[] args){
dog d1=new dog();
d1.setsize(30);
dog d2=new dog();
d2.setsize(8);
System.out.println(d1.getsize());
System.out.prinln(d2.getsize());
d1.bark();
d2.bark();
}
}