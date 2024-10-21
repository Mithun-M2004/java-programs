abstract class shape{
    int dimension1,dimension2;
 
      
       public shape(int d1,int d2)
{ 
       this.dimension1=d1;
       this.dimension2=d2;
}
    
abstract void PrintArea();
}


class Rectangle extends shape
{

       Rectangle(int length,int width)
{
       super(length,width);

}

void PrintArea()
{
       int area=dimension1*dimension2;
       System.out.println("The area of rectangle is "+area);
}

}

class Triangle extends shape
{
       Triangle(int base,int height)
       {
             super(base,height);
       }
  
       void PrintArea()
{
       double area=0.5*dimension1*dimension2;
       System.out.println("the area of the triangle is "+area);

       }


}
 
 
class Circle extends shape
{

       Circle(int radius)
       {
              super(radius,0);
       }


       void PrintArea()
       {
             double area=Math.PI*dimension1*dimension1;
             System.out.println("the area of the circle is "+area);
  
       }



}


public class main{
      public static  void main(String args[])
{
      Rectangle rectangle=new Rectangle(10,20);
      Triangle  triangle=new Triangle(10,8);
      Circle circle=new Circle(7);

      rectangle.PrintArea();
      triangle.PrintArea();
      circle.PrintArea();

}
}
     
