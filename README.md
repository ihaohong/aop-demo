# AOP应用场景和实现方法

## 什么样的场景需要用到AOP？
举几个栗子
* 比如，需要对所有的Service层里的方法进行耗时统计；
* 比如，需要对一部分Controller里的action进行权限验证；
* 比如，需要对Service里的某些方法进行事务管理，让其方法具有原子性；
* 比如，记录访问日志；
* 比如，资源池，数据库连接池的管理
* ......

## 实现方式
* [写死代码](https://github.com/ihaohong/aop-demo/blob/master/src/test/java/com/springstudy/method1/UserServiceImplTest.java)
* [静态代理](https://github.com/ihaohong/aop-demo/blob/master/src/test/java/com/springstudy/method2/UserServiceProxyTest.java)
* [JDK动态代理](https://github.com/ihaohong/aop-demo/blob/master/src/test/java/com/springstudy/method3/JDKDynamicProxyTest.java)
* [CGLib动态代理](https://github.com/ihaohong/aop-demo/blob/master/src/test/java/com/springstudy/method4/CGLibDynamicProxyTest.java)

## 下载
```bash
git clone git@github.com:ihaohong/aop-demo.git
```

## 测试
```bash
./gradlew test
```

## 博文地址
[https://ihaohong.github.io/2018/02/16/spring-aop/](https://ihaohong.github.io/2018/02/16/spring-aop/)
