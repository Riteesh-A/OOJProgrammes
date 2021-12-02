

import java.util.*;

class A
{ 
    double area(double x, double y)
    {
        return x*y;
    }
}

class B extends A 
{
    double area(double x, double y)
    {
        return 0.5*x*y;
    }
}

class C extends A 
{
    double area(double x,double y)
    {
        return Math.pow(x,2) ;
    }
}


class Dynamic
{
    public static void main(String[] args) 
    {
     A a1 = new A();
     B b1 = new B();
     C c1 = new C();
     A r;
     r = a1;
     System.out.println("Area of rectangle :" +r.area(10,20));
     r = b1;
     System.out.println("Area of Triangle :" +r.area(20,40));
     r = c1;
     System.out.println("Area of Square :" +r.area(10,1));

    }
}
