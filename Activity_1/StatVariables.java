public class StatVariables{
	
	private static int numCircles=0;
	private double x,y,r;

	Circle(double x, double y, double r){
		this.x= x;
		this.y= y;
		this.r= r;

		numCircles++;

	}
}