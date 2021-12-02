import java.util.*;

class A
{ 
    int i,j;
    A (int a, int b)
    {
        i = a;
        j = b;
    }
    
    void show()
    {
        System.out.println(" value of i and j is " + i + " & "+j);
    }
}

class B extends A 
{
    int k;
    B (int x, int y, int z)   
    {
        super(x,y);
        k = z;
    }
    void show()
    {
        super.show();
        System.out.println(" value of k is "+ k);
    }
}


class Override
{
    public static void main(String[] args) 
    {
     B subob = new B(90,100,105);
     subob.show();
    }
}
