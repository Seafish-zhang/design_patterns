package com.colin.creational.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Description:懒汉式.
 *
 * @author zhy
 * @date 2020/5/25
 */
public class IdGenerator2 {

  private static IdGenerator2 instance;
  private AtomicLong id = new AtomicLong(0);

  private IdGenerator2() {

  }

  public static IdGenerator2 getInstance() {
    if (instance == null) {
      instance = new IdGenerator2();
    }
    return instance;
  }

  public long getId() {
    return id.incrementAndGet();
  }

}
