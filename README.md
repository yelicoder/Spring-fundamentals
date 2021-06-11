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
* Component scanning
* Sterotypes
* Bean
  * Scopes
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


### Conference-java-module1
* Setter injection
  * Setter Injection simply calling a setter
  * Simple as a method call
  * Setter injection in AppConfig.java
  * getSpeakerRepository can be called many times, only one HibernateSpeakerRepositoryImpl instance will be created because it is a Bean besides there is a "new HibernateSpeakerRepositoryImpl()" for each call.

### Module4


