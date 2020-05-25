package com.colin.creational.factory;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/25
 */
public class DogFactory implements AnimalFactory {

  @Override
  public Animal createAnimal() {
    return new Dog();
  }
}
