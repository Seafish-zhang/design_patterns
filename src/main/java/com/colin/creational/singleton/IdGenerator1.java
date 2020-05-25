package com.colin.creational.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Description:饿汉式.
 *
 * @author zhy
 * @date 2020/5/25
 */
public class IdGenerator1 {

  private static final IdGenerator1 instance = new IdGenerator1();
  private AtomicLong id = new AtomicLong(0);

  private IdGenerator1() {

  }

  public static IdGenerator1 getInstance() {
    return instance;
  }

  public long getId() {
    return id.incrementAndGet();
  }

}
