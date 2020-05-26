package com.colin.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Description:所有的具体享元类的基类，为具体享元规范需要实现的公共接口，非享元的外部状态以参数的形式通过方法传。
 *
 * @author zhy
 * @date 2020/5/26
 */
public class FlyweightFactory {

  private Map<String, Flyweight> flyweightMap = new HashMap<>();

  public Flyweight getFlyweight(String key) {
    if (flyweightMap.containsKey(key)) {
      System.out.println("享元类" + key + "已存在");
    } else {
      System.out.println("享元类" + key + "被创建");
      Flyweight flyweight = new Flyweight();
      flyweight.setId(UUID.randomUUID().toString());
      flyweightMap.putIfAbsent(key, flyweight);
    }
    return flyweightMap.get(key);
  }
}
