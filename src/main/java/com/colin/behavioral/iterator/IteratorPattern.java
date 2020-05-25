package com.colin.behavioral.iterator;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/25
 */
public class IteratorPattern {

  public static void main(String[] args) {
    Aggregate aggregate = new ConcreteAggregate();
    aggregate.add("中山大学");
    aggregate.add("华南理工");
    aggregate.add("韶关学院");
    System.out.print("聚合的内容有：");
    Iterator iterator = aggregate.getIterator();
    while (iterator.hasNext()) {
      Object ob = iterator.next();
      System.out.print(ob.toString() + "\t");
    }
    Object ob = iterator.first();
    System.out.println();
    System.out.println("第一个是：" + ob.toString());
  }
}
