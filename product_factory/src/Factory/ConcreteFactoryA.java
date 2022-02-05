package Factory;
import Products.ProductA.AbstractProductA;
import Products.ProductB.AbstractProductB;

import Products.ProductA.ProductA1;
import Products.ProductB.ProductB1;

public class ConcreteFactoryA extends AbstractFactory{
  @Override
  public AbstractProductA CreateProductA()
  {
      return new ProductA1();
  }

  @Override
  public AbstractProductB CreateProductB()
  {
      return new ProductB1();
  }
}
