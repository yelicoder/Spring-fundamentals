# Spring-fundamentals
Spring Framework: Spring Fundamentals

### What is dependency injection and what are the advantage of using it?
Dependency Injection is a process whereby objects define their dependencies (that is, the other objects they work with) only through constructor arguments, arguments to a factory method, or properties that are set on the object instance after it is constructed or returned from a factory method.

### What is an interface and what are the advantages of making use of them in Java?
* Interface is a contract between the client and the class that implements the interface. As long as the interface is implemented by the implementing class, the client is satisfied. It does not matter what is underneath the interface method implementation.
* The advantanges of using interfaces
  * Polymorphism
  * Dependency injection
  * Separation of concern (Interface vs implementation)
  * Encapsulation (hide the implemenetation)

### What is an ApplicationContext?
The BeanFactory interface provides an advanced configuration mechanism capable of managing any type of object. ApplicationContext is a sub-interface of BeanFactory. It adds:
* Easier integration with Spring’s AOP features
* Message resource handling (for use in internationalization)
* Event publication
* Application-layer specific contexts such as the WebApplicationContext for use in web applications.
In short, the BeanFactory provides the configuration framework and basic functionality, and the ApplicationContext adds more enterprise-specific functionality.

### How are you going to create a new instance of an ApplicationContext?
* new ClassPathXmloApplicationContext() and passing the xml configuration file as argument
* new GenericGroovyApplicationContext
* new GenericApplicationContext
*  

### Can you describe the lifecycle of a Spring Bean in an ApplicationContext?

### How are you going to create an ApplicationContext in an integration test?

### What is the preferred way to close an application context? Does Spring Boot do this for you?

### Can you describe dependency injection using Java configuration?

### Can you describe dependency injection using annotations (@Autowired)?

### Can you describe Component scanning?

### Can you describe Stereotypes?

### Can you describe scopes for Spring beans? What is the default scope?

### Are beans lazily or eagerly instantiated by default? How do you alter this behavior?

### What is a property source? How would you use @PropertySource

### What is a BeanFactoryPostProcessor and what is it used for? When is it invoked?

#### Why woudl you define a static @Bean method when creating your own BeanFactoryPostProcessor?
#### What is a PropertySourcesPlaceholderConfigurer used for?

### What is a BeanPostProcessor and how is it different to a BeanFactoryPostProcessor? What do they do? When are they called?
#### What is an initialization method and how is it declared on a Spring bean?
#### What is a destroy method, how is it declared and when is it called?
#### Consider how you enable JSR-250 annotations like @PostConstruct and @PreDestroy? When/how will they get called?
#### How else can you define an initalization or destruction method for a Spring bean?

### What does component-scanning do?
### What is the behavior of the annotation @Autowired with regardsd to field injection, constructor injection and method injection?

### How does the @Qualifier annotation complement the use of @Autowired?

### What is a proxy object and what are the two different types of proxies Spring can create?
#### What are the limitations of these proxies (per type)?
#### What is the power of a proxy object and where are the disadvantages?

### What does the @Bean annotation do?

### What is the default bean id if you only use @Bean? How can you override this?
### Why are you not allowed to annotate a final class with @Configuration
#### How do @Configuratioin annotated classed classes support singleton beans?
#### Why can't @Bean method be final either?

### How do you configure profiles? What are possible use cases where they might be useful?

### Can you use @Bean together with @Profile?

### Can you use @Component together with @Profile?

### How many profiles can you have?

### How do you inject scalar/literal values into Spring beans?
#### What is @Value used for?

### What is Spring Expression Language (SpEL for short)?

### What is the Environment abstraction in Spring?

### Where can properties in the environment come from - there are many sourcesw for properties - check the documentation if not sure. Spring Boot adds even more

### What can you reference using SpEL?

### What is the difference between $ and # in @Value expressions?








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
