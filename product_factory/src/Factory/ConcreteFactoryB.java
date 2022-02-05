package Factory;
import Products.ProductA.AbstractProductA;
import Products.ProductB.AbstractProductB;

import Products.ProductA.ProductA2;
import Products.ProductB.ProductB2;

public class ConcreteFactoryB extends AbstractFactory{
  @Override
  public AbstractProductA CreateProductA()
  {
      return new ProductA2();
  }

  @Override
  public AbstractProductB CreateProductB()
  {
      return new ProductB2();
  }
}
