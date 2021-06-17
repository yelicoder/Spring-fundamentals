# Spring-fundamentals
Spring Framework: Spring Fundamentals

### Overview
* Dependency Injection
  * Objects define their dependencies (that is, the other objects they work with) only through constructor arguments, arguments to a factory method, or properties that are set on the object instance after it is constructed or returned from a factory method
  * Using Java configuration
  * Using annotations
     * @Autowired
         * on a property (field): byType
         * on a property setter: byType
         * on a constructor: constructor
     * @Qualifier: used for conflict resolution if there are two beans with the same type.
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
    * Namespaces aid in configuration/validation
* Component scanning
* Sterotypes
  * @Component
  * @Repository
  * @Service: business logic
  * @Controller
* Bean
  * Beans are essentially classes. Defining beans replaces keyword new. Define classes, use interfaces.
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
* constructor injection and setter injection can be used freely because sterotype annotation eliminated the need to instantiate the bean manually.
* If @Autowired is on both constructor and setter, spring will call both.

### conference-java-module9
* @PostConstruct are called after the constructor and the setter

### conference-java-module 10 FactoryBean
* Builds on initMethod concept
* Factory Method Pattern
* Legacy Code: contract without constructor
* Static Methods
* CalendarBean created by the factory
* https://spring.io/blog/2011/08/09/what-s-a-factorybean

### conference-java-module 11 SpEL
* Manipulate Object Graph
* Evaluate at Runtime
* Configuration

### conference-java-module 12 using proxy factory

### conference-java-module 13 using bean profile
* inject different beans based on @Profile("...") value
* JVM argument: -Dspring.profiles.active="..."

### conference-xml-module1
* Simple bean definition: name and class. Class is the implementation class, not the interface
* Setter injection: user property. The property name should match the setter method of the bean


### conference-xml-module2
* Constructor injection: Guaranteed contract. Need have Constructor defined. Index based.
* constructor-arg tag, index and ref attribute
* Setter and Constructor injector can be used together
* Autowire:default is byType
  * Spring auto wires bean
  * byType
  * byName
  * constructor

### conference-xml-module3
* Autowire constructor
  
### conference-xml-module4
* Autowire by type

### conference-xml-module5
* Autowire by name
* Setter method name has to match the name of the bean to be injected

### Bean Lifecycle
* Instantiation
* Populate Properties
* BeanNameAware
* BeanFactoryAware
* Pre Initialization - BeanPostProcessors
* InitializeBean
* InitMethod
* Post Initialization - BeanPostProcessors
