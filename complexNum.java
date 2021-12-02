import java.util.*;

class complexNum
{
    double real, img;
    
    complexNum(double real, double img)
    {
        this.real = real;
        this.img = img; 

    }

    static complexNum add(complexNum a, complexNum b)
    {
        complexNum c = new complexNum(0,0);
        c.real = a.real + b.real;
        c.img = a.img + b.img;
        return c;
    }

    static complexNum sub(complexNum a, complexNum b)
    {
        complexNum c = new complexNum(0,0);
        c.real = a.real - b.real;
        c.img = a.img - b.img;
        return c;
    }

}

class start
{
    public static void main(String args[]) 
    {
        complexNum a = new complexNum(2,3);
        complexNum b = new complexNum(5,6);
        complexNum res = new complexNum(0,0);
        res = complexNum.add(a,b);
        System.out.print("\nSum of complex numbers: "+res.real+"+i"+res.img);
        res = complexNum.sub(a,b);
        if(res.img > 0)
        System.out.print("\ndifference of complex numbers: "+res.real+"+i"+res.img);
        else 
        System.out.print("\ndifference of complex numbers: "+res.real+"-i"+(-res.img));
    }
}