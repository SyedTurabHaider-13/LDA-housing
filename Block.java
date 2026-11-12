public class Block{
private String BlockName;
private Plot[] plots;
 int count=0;

Block(String Name,int amount){
this.BlockName=Name;
 plots=new Plot[amount];
  for(int i=0;i<plots.length;i++){
     plots[i]=null;
 
 }
}
public Plot addPlots(Plot p){
 if(p!=null && count<plots.length){
      plots[count]=p;
       count++;
      return p;
}
return null;
}

 public void DisplayBlock(){
 System.out.println("Block name: "+BlockName);
 for(int i=0;i<count;i++){
    plots[i].DisplayPlot();
}

}

public void CalculateBarea(){
   
 for(int i=0;i<count;i++){
    double a=plots[i].CalculateArea();
 System.out.println(a);
}
}

}




 