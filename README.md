# SpringBoot结合Dubbo和Zookeeper学习项目

消费者提供者接入Dubbo流程
1、将服务提供者注册到注册中心
   a、导入dubbo依赖以及操作zookeeper的客户端
   b、配置服务提供者
2、让服务消费者去注测中心订阅服务提供者的服务地址

SpringBoot与Dubbo整合的三种方式：
1、导入Dubbo的SpringBoot的starter，在application.yml配置属性，使用@DubboService（暴露服务）和@DubboReference（调用远程服务）
2、保留Dubbo的xml配置文件的配置模式，不需要使用application.yml文件，使用dubbo.yml文件配置Dubbo
    导入Dubbo的starter，使用@ImportResource导入Dubbo的配置文件
3、使用注解API的方式，写一个配置类
    将每一个组件手动创建到容器中，让Dubbo来扫描其它组件