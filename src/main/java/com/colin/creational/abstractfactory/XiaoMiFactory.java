package com.colin.creational.abstractfactory;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/25
 */
public class XiaoMiFactory implements AbstractHighTechFactory {

  @Override
  public Computer createComputer() {
    return new XiaoMiComputer();
  }

  @Override
  public Phone createPhone() {
    return new XiaoMIPhone();
  }
}
