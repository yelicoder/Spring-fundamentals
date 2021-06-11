# Spring-fundamentals
Spring Framework: Spring Fundamentals

### Overview
* Dependency Injection
  * Using Java configuration
  * Using annotations
     * @Autowired
     * @Qualifier
* Interface
* ApplicationContext
  * creating ApplicationContext: Application context creates a registry of beans. The code can get beans from the registry instead of hard coded the instantiation of the beans.
  ```
  ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class)
  ```
  
  * Lifecycle of a Spring Bean in an ApplicationContext
  * ApplicationContext and Integration test
  * Close an application context
  * applicationContext.xml
    * Name doesn't matter. default is applicationContext.xml
    * Spring Context sort of a HashMap
    * Can simply be a registry
    * XML configuration begins with this file
* Component scanning
* Sterotypes
  * @Component
  * @Repository
  * @Service: business logic
  * @Controller
* Bean
  * Scopes
    * @Scope can be added right below @Bean
    * @Scope(BeanDefinition.SCOPE_SINGLETON)
    * Singleton: one instance per Spring container
    * Prototype: one instance per request
    * Request: return an instance per HttpRequest
    * Session: return an instance per HttpSession
    * GlobalSession: return an instance per applicatioin
  * Instantiation
* Property source
* BeanFactoryPostProcessor
* PropertySourcesPlaceholderConfigurer
* BeanPostProcessor
* Proxy object
* @Bean
  * Spring Beans defined by @Bean
  * @Bean at method level
* @Configuration
  * applicationContext.xml replaced by @Configuration
  * @Configuration at class level
* @Profiles
* @Value
* Environment abstraction
* 


### Conference-java-module2
* Setter injection
  * Setter Injection simply calling a setter
  * Simple as a method call
  * Setter injection in AppConfig.java
  * getSpeakerRepository can be called many times, only one HibernateSpeakerRepositoryImpl instance will be created because it is a Bean besides there is a "new HibernateSpeakerRepositoryImpl()" for each call.
### Conference-java-module3
* Constructor injection
  * Inject the bean by calling constructor in AppConfig.java

### Conference-java-module4
* Singleton bean scope

### conference-java-module5
* Prototype bean scope: a unique instance per request

### conference-java-module6
* If @Autowired, the setter method will be called to inject the respository. Otherwise, the setter method will not be called
* If @Autowired on the constructor, it will not inject the repository because in AppConfig the no arg constructor is called.

### conference-java-module7
* If stereotype is used, the bean does not need to be defined in AppConfig. @Autowire is still needed to inject another bean.
* @Scope can be defined after the stereotype annotation

### conference-java-module8
* constructor injection and setter injection can be used freely because no AppConfig to instantiate the bean

