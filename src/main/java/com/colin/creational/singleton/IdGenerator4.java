package com.colin.creational.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Description:静态内部类.
 *
 * @author zhy
 * @date 2020/5/25
 */
public class IdGenerator4 {

  private AtomicLong id = new AtomicLong(0);

  private IdGenerator4() {

  }


  public static IdGenerator4 getInstance() {
    return SingletonHolder.instance;
  }

  public long getId() {
    return id.incrementAndGet();
  }

  private static class SingletonHolder {

    private static final IdGenerator4 instance = new IdGenerator4();
  }

}
