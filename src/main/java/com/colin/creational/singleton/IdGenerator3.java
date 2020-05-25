package com.colin.creational.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Description:双重检测.
 *
 * @author zhy
 * @date 2020/5/25
 */
public class IdGenerator3 {

  private static IdGenerator3 instance;
  private AtomicLong id = new AtomicLong(0);

  private IdGenerator3() {

  }

  public static IdGenerator3 getInstance() {
    if (instance == null) {
      synchronized (IdGenerator3.class) {
        if (instance == null) {
          instance = new IdGenerator3();
        }
      }
    }
    return instance;
  }

  public long getId() {
    return id.incrementAndGet();
  }

}
