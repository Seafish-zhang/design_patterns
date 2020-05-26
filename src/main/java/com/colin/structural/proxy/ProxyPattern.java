package com.colin.structural.proxy;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/26
 */
public class ProxyPattern {

  public static void main(String[] args) {
    DynamicProxy dynamicProxy = new DynamicProxy();
    Subject proxy = (Subject) dynamicProxy.createProxy(new SubjectImpl());
    proxy.talk();
  }
}
