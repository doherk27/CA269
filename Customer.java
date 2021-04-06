import java.util.List;
import java.util.ArrayList;

class Customer 
{
    private String _name;
    private List _rentals = new ArrayList();
    
    public Customer (String name, List rentals)
    { 
        _name = name;
        _rentals = rentals;
    }

    public List getRentals()
    {
        return _rentals;
    }


    public String getName()
    {
        return _name;
    }

    

    public String toString()
    {
        return _name + ": " + getRentals();
    }
}