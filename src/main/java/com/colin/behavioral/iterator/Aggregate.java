package com.colin.behavioral.iterator;

/**
 * Description:定义存储、添加、删除聚合对象以及创建迭代器对象的接口.
 *
 * @author zhy
 * @date 2020/5/25
 */
public interface Aggregate {

  void add(Object obj);

  void remove(Object obj);

  Iterator getIterator();
}
