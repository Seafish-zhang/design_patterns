package com.colin.creational.factory;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/25
 */
public class FactoryPattern {

  public static void main(String[] args) {
    String race = "DOG";
    Animal animal = getAnimal(race);
    animal.call();

    // 简单工厂模式
    SimpleFactory simpleFactory = new SimpleFactory();
    Animal animal1 = simpleFactory.cacheAnimal(race);
    animal1.call();
    Animal animal2 = simpleFactory.createAnimal(race);
    animal2.call();

  }

  private static Animal getAnimal(String race) {
    AnimalFactory animalFactory;
    switch (race) {
      case "DOG":
        animalFactory = new DogFactory();
        break;
      case "CAT":
        animalFactory = new CatFactory();
        break;
      default:
        throw new NullPointerException("没有这类型工厂");
    }
    return animalFactory.createAnimal();
  }
}
