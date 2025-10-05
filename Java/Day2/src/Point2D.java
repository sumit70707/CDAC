import java.lang.Math;
public class Point2D{

private double x;
private double y;

Point2D(double x,double y){
this.x=x;
this.y=y;
}
public String show(){
return "Value of X is :  "+x+" Value of Y is : "+y;
}
public boolean isEqual(Point2D anotherPoint){

return (this.x==anotherPoint.x)&&(this.x==anotherPoint.x);
}
public double calculateDistance(Point2D distancePoint){

return Math.sqrt(Math.pow((this.x-distancePoint.x),2)+Math.pow((this.y-distancePoint.y),2));

}
}