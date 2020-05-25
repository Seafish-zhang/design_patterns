package com.colin.creational.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:简单工厂.
 *
 * @author zhy
 * @date 2020/5/25
 */
public class SimpleFactory {

  private static final Map<String, Animal> cacheAnimal = new HashMap<>();

  static {
    cacheAnimal.put("DOG", new Dog());
    cacheAnimal.put("CAT", new Cat());
  }

  /**
   * 简单工厂，当产品不多且不会增加是，可以直接用简单工厂模式.
   *
   * @param race 种族
   * @return 动物产品
   */
  public Animal createAnimal(String race) {
    if ("DOG".equals(race)) {
      return new Dog();
    } else if ("CAT".equals(race)) {
      return new Cat();
    }
    return null;
  }

  /**
   * 如果可以服用，为了节省内存和对象创建时间，可以先把产品缓存起来，需要时直接取出.
   *
   * @param race 种族
   * @return 动物产品
   */
  public Animal cacheAnimal(String race) {
    return cacheAnimal.get(race);
  }
}
