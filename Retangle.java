package my;
import java.util.Scanner;
public class Retangle {
        private double length;
        private double width;
        private double area;
        public Retangle(double a,double b){
            this.length=a;
            this.width=b;
        }

        public double getArea(double length,double width){
            area=length*width;
            return area;
        }
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.println("Please input length:");
            Double a=in.nextDouble();
            System.out.println("Please input width:");
            Double b=in.nextDouble();
            Retangle area=new Retangle(a,b);
            System.out.println("The lengh is:"+a);
            System.out.println("The width is:"+b);
            System.out.println("The area is:"+area.getArea(a,b));
        }
    }



