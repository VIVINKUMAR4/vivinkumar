class clock{
String time;
public void settime(String time){
this.time=time;
}
public String gettime(){
return time;
}
}
public class clocks{
public static void main(String[] args){
clock c=new clock();
c.settime("1245");
System.out.println("time is"+c.gettime());
}
}