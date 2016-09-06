## licq-first-service
RESTful WebService是把一切对象方法看做资源，开发RESTful WebService意味着支持在多种媒体类型以及抽象底层的客户端-服务器通信细节，如果没有一个好的工具包可用，会变得不那么容易。为了简化使用JAVA开发RESTful WebService及其客户端，一个轻量级的标准被提出：JAX-RS API。
Jersey RESTful WebService框架是一个开源的、产品级别的JAVA框架，支持JAX-RS API并且是一个JAX-RS(JSR 311和 JSR 339)的参考实现。

Jersey不仅仅是一个JAX-RS的参考实现，Jersey提供自己的API，其API继承自JAX-RS，提供更多的特性和功能以进一步简化RESTful service和客户端的开发。Jersey2.1版本之前默认HK2作为Ioc容器， 后面才增加了Spring的支持。同时默认采用glassfish作为web容器。
