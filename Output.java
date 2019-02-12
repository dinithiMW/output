
public class Output {
    public static void main(String args[])
    {
    int a=1;
    int b=2;
    int c;
    int d,e;
    
    c=++b;
    d=a++;
    e=a++;
    {System.out.println(c);
    System.out.println(d);
    }
    c++;
    b++;
    ++a;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    }
    
}
