package com.colin.creational.abstractfactory;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/25
 */
public class HuaWeiFactory implements AbstractHighTechFactory {

  @Override
  public Computer createComputer() {
    return new HuaWeiComputer();
  }

  @Override
  public Phone createPhone() {
    return new HuaWeiPhone();
  }
}
