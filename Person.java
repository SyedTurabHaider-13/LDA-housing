public class Person{
 private String name;
 private String cnic;
 private String phoneno;

 Person(String n,String c,String p){
 this.name=n;
 this.cnic=c;
 this.phoneno=p;
}

public String Displayinfo(){
 return name+" "+cnic+" "+phoneno;
}
public String toString(){
   return name+" "+cnic+" "+phoneno;
}
}