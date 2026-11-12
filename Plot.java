public class Plot{
  private int PlotNo;
  private PlotType type;
  private Shape shape;
  private Person owner;
  
  Plot(int no, PlotType type,Shape shape,Person p){
   this.PlotNo=no;
   this.type=type;
   this.shape=shape;
   this.owner=p;
}
public void DisplayPlot(){
   System.out.println(PlotNo+" "+type+" "+shape+" "+owner);
}

public double CalculateArea(){
       return shape.calculateArea();
}
}