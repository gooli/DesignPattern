# DesignPattern
# 23种设计模式： #
## 创建型模式 ##

   - **singleton单例模式：**
      - lazySingleton懒汉式单例模式：延迟加载，创建效率低，需要同步整个方法块。
      - hungrySingleton饿汉式单例模式：创建对象时便加载。
      - DoubleCheckSingleton双重检测式单例模式：通过双重检测进行生成一个对象，可延迟加载，但限于jvm，可能会报错，不建议使用。
      - StaticInnerSingleton静态内部类单例模式：可延迟加载，且创建效率高，推荐使用。
      - EnumSingleton枚举式单例模式：枚举在实现时，便已经是单例。
     ---
   - **factory工厂模式：**
      - simpleFactory简单工厂：不符合设计模式的开闭原则（对扩展开放，修改关闭），每次新增新产品，均需要修改源代码。
      - factorymethod工厂方法：符合设计模式原则，但增加了复杂度。
      - abstractfactory抽象工厂：多个接口实现同一个接口时，可以考虑使用抽象，但增加产品族较为简单，增加产品困难。
   ---
   - **builder建造者模式：**
      - xxBuilder：生产零部件。
      - xxDirector：组装零部件。
   ---
   - **prototype原型模式：**
   如果对象创建较为复杂，且需要创建多个对象时，可以考虑此方法。
## 结构性模式 ##

   - **adapter适配器模式：**
      - 如果直接调用第三方类不方便，那么可以考虑建立一个中间人，让它帮你做一些事情，而你只需要知道他怎么做即可，一般用于老版本升级新版本时使用。
         - adaptee：将要被代理的类，一般也可以看做是老版本的功能。
         - target：代理类的接口，由他对外暴露方法，面向接口实现。
         - adapter：代理类，作为一个中介者，负责新版本与老版本功能的协调。
   ---
   - **proxy代理模式：**
	   - staticproxy静态代理：代理类和被代理类均需要实现相同的接口，然后由被代理类调用代理类中的方法，代理类无需关心什么时候被调用。
	      - SingInterface：经纪人与歌手都需要实现的接口。
	      - proxySinger:唱歌的经纪人，由他负责所有的事情，谈判、签合同、收钱，也包括安排歌手唱歌。
	      - RealSinger：歌手，只负责唱歌，其他的事情一概不管。
	   - dynamicproxy动态代理：二者均是被接口代理，因此需要实现相同的接口，然后实现InvocationHandle接口，获得一个handle对象，根据传入的方法名获得不同的代理方法。
	      - SingInterface：经纪人与歌手都需要实现的接口，由他按照情况分别调用经纪人和歌手进行安排事情。
          - proxySinger:唱歌的经纪人，只负责自己关心的事情，比如谈判、签合同、收钱等，其他与之无关的事情，不归自己管。
          - RealSinger：歌手，只负责唱歌。
   ---
   - **bridge桥接模式：**
      按照单一职责的理念原则，将功能进行拆分，比如神舟笔记本，拆成品牌神舟和笔记本，分别进行实现，通过组合的方式实现功能的拼装，减少代码的冗余。
   ---
   - **composite组合模式：** 描述的是整体与部分的关系，尤其适用于树形结构，天然的需要递归。
        - Component：组件接口，下属叶子节点与组件。
        - Composite：实现Component接口，在本文中描述为文件夹。
        - leaf：不可再拆分的点，为叶子节点，因为Composite也需要容纳Composite与Leaf，因此，二者需要实现相同的接口。
   ---
  - **decorator装饰者模式：** 描述的是在不修改源代码的情况下，给原有的代码添加新功能。
       - 公用接口：只有装饰者和被装饰者都实现相同的接口，二者才能被互相装饰。常见的装饰者模式如IO流，基本上都是采用了装饰者模式。