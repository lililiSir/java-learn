### 设计模式-工厂模式

- 工厂模式是最常见的一种设计模式，是一种创建型设计模式，提供一种创建对象的最佳方式。
- 在工厂模式中，对象的创建被延迟到子类中，由子类决定实例化哪一个工厂

优点：
- 1、扩展性高，如果需要增加产品，只需要扩展相应的类就可以
- 2、屏蔽具体类的实现方法，调用者只需要关注接口方法就可以
- 3、不需要知道创建类的具体方法，只需要知道所需类的类名就可以创建

缺点
- 每增加一个产品，需要增加一个具体的实现类和对象实现工厂，随着数量的增多，在一定程度上增加了系统的复杂度，同时也增加了系统的依赖

使用场景
一些常见的配置，如hibernate、邮件服务器在spring中的配置，都是使用的是工厂模式，只需要配置相应的参数，即可实现
