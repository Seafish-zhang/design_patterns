package com.colin.creational.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Description:枚举.
 *
 * @author zhy
 * @date 2020/5/25
 */
public enum IdGenerator5 {
  INSTANCE;

  private AtomicLong id = new AtomicLong(0);

  public long getId() {
    return id.incrementAndGet();
  }
}
