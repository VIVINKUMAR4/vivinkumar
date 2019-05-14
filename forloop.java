class forloop{
public static void main(String[] args){
forloop f=new forloop();
f.go();
}
void go(){
int a=7;
for(int b=1;b<8;b++)
{
a++;
if(b>4){
System.out.print(++a+" ");
}
if(a>14)
{
System.out.print("b="+b);
break;
}
}
}
}