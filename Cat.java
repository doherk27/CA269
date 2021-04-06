public class Cat implements Strange
{
    private String name;
    
    public Cat(String n)
    {
        name = n;
    }
    
    public String toString()
    {
        return "cat: " + name;
    }
}