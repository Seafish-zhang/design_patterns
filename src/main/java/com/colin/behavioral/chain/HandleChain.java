package com.colin.behavioral.chain;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/28
 */
public class HandleChain {

  private Handle head = null;
  private Handle tail = null;

  public void addHandle(Handle handle) {
    handle.setSuccessor(null);
    if (head == null) {
      head = handle;
      tail = handle;
      return;
    }
    tail.setSuccessor(handle);
    tail = handle;
  }

  public void handle(int number) {
    if (head != null) {
      head.handle(number);
    }
  }
}
