package com.colin.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/26
 */
public class DynamicProxy {

  public Object createProxy(Object proxiedObject) {
    Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
    DynamicProxyHandle dynamicProxyHandle = new DynamicProxyHandle(proxiedObject);
    return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces,
        dynamicProxyHandle);

  }

  private class DynamicProxyHandle implements InvocationHandler {

    private Object proxiedObject;

    public DynamicProxyHandle(Object proxiedObject) {
      this.proxiedObject = proxiedObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      preMethod();
      Object invoke = method.invoke(proxiedObject, args);
      postMethod();
      return invoke;

    }

    private void postMethod() {
      System.out.println("代理方法之后执行");
    }

    private void preMethod() {
      System.out.println("代理方法之前执行");
    }
  }
}
