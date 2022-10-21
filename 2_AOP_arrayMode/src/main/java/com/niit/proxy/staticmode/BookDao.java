package com.niit.proxy.staticmode;

/*静态代理使用约束接口：
*   代理类：被代理类需要同时实现该接口
*   */
public interface BookDao {
    public void add();
    public void delete();
    public void update();
    public String select();



}
