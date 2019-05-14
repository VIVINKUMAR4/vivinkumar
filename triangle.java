class triangles{
int height;
int length;
double area;
void setarea(){
area=(height*length)/2;
}
}
class triangle{
public static void main(String[] args){
int x=0;
triangle[] t=new triangle[2];
while(x<2){
t[x]=new triangle();
t[x].height=(x+1)*2;
t[x].length=x+4;
t[x].setarea();
System.out.print("triangle "+x+", area ="+t[x].area);
x++;
}
}
}