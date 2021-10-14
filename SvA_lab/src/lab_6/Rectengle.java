package lab_6;

public class Rectengle {
	static private double width;
	static private double height;
	
 
  public Rectengle(double w,double h){
	  width=w;
	  height=h;
  }
  static public double getArea(){
	  double area;
	  area=width*height;
	  return area;
  }
  
}
