import Factory.AbstractFactory;
import Products.ProductA.AbstractProductA;
import Products.ProductB.AbstractProductB;

public class Client
{
    private AbstractProductA _productA;
    private AbstractProductB _productB;
 
    public Client(AbstractFactory factory)
    {
        _productA = factory.CreateProductA();
        _productB = factory.CreateProductB();
    }
}