class student{
private String name;
private int rollNo;
public void setname(String name){
this.name=name;
}
public void setrollNo(int rollNo)
{
this.rollNo=rollNo;
}
public String getname(){
return name;
}
public int getrollNo(){
return rollNo;
}
}
public class member{
public static void main(String[] args){
student s=new student();
s.setname("sona");
s.setrollNo(1);
System.out.println(s.getname());
System.out.println(s.getrollNo());
}
}
