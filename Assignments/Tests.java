public class Tests{

public static void main(String args[])
{
Holder h=new Holder(); b. held=100;

h. bump(h);

System.out.printlnt(h.held);
}
}

class Holder
{
public int held;
 public void bump (Holder h)
{
h.held++;
}
}