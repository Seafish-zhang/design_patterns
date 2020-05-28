package com.colin.behavioral.chain;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/28
 */
public abstract class Handle {

  protected Handle successor = null;

  public Handle getSuccessor() {
    return successor;
  }

  public void setSuccessor(Handle handle) {
    this.successor = handle;
  }

  public abstract void handle(int number);
}
