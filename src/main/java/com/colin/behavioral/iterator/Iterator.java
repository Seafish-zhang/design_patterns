package com.colin.behavioral.iterator;

/**
 * Description:访问和遍历聚合元素的接口，通常包含 hasNext()、first()、next() 等方法.
 *
 * @author zhy
 * @date 2020/5/25
 */
public interface Iterator {

  Object first();

  Object next();

  boolean hasNext();
}
