package com.colin.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:实现抽象聚合类，返回一个具体迭代器的实例.
 *
 * @author zhy
 * @date 2020/5/25
 */
public class ConcreteAggregate implements Aggregate {

  private List<Object> list = new ArrayList<Object>();

  public void add(Object obj) {
    list.add(obj);
  }

  public void remove(Object obj) {
    list.remove(obj);
  }

  public Iterator getIterator() {
    return (new ConcreteIterator(list));
  }
}
