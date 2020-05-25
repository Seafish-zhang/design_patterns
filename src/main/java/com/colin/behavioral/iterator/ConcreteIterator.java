package com.colin.behavioral.iterator;

import java.util.List;

/**
 * Description:实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置.
 *
 * @author zhy
 * @date 2020/5/25
 */
public class ConcreteIterator implements Iterator {

  private List<Object> list = null;
  private int index = -1;

  public ConcreteIterator(List<Object> list) {
    this.list = list;
  }

  public boolean hasNext() {
    return index < list.size() - 1;
  }

  public Object first() {
    index = 0;
    return list.get(index);
  }

  public Object next() {
    Object obj = null;
    if (this.hasNext()) {
      obj = list.get(++index);
    }
    return obj;
  }
}
