package com.colin.structural.proxy;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/26
 */
public class Proxy implements Subject {

  private SubjectImpl subject;

  @Override
  public void talk() {
    preTalk();
    if (subject != null) {
      subject.talk();
    }
    postTalk();
  }

  private void postTalk() {
    System.out.println("subject.talk() 之后");
  }

  private void preTalk() {
    System.out.println("subject.talk() 之前");
  }
}
