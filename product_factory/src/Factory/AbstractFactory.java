package Factory;
import Products.ProductA.AbstractProductA;
import Products.ProductB.AbstractProductB;

public abstract class AbstractFactory
{
    public abstract AbstractProductA CreateProductA();
 
    public abstract AbstractProductB CreateProductB();
}