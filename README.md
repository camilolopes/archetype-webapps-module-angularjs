webapps-module-angularjs
========================

webapps module archetype for creating web application with **AngularJS 1.0.x with Yeoman**, **Twitter bootstrap**, **Hibernate 4.x**, **Spring Core 3.x**, **Jersey 1.x**, **DBUnit** and Util Java API separated by modules  back/front-end.

###Required 

* Maven installed 

###Features & Benefits 

* DAO Generic implemented; 
* Service Generic implemented; 
* Structure for DBUnit done; 
* back/front end separated in modules: webapps-core and webapps-web 
* [flyway plugin](http://flywaydb.org) setup for db migration (option configuration); 
* [Yeoman](http://yeoman.io)
* Spring and Hibernate configured; 
* MySql 5.x 
* Twitter BootStrap support; 
* Jersey Configured; 

###How to Install local?

**Step 1**

```java
git clone git@github.com:camilolopes/archetype-webapps-module-angularjs.git
```

**Step 2**

* Go to the folder and execute: 

```java
mvn clean install 
```

**Step 3**

* create new maven project via Eclipse ;
* in Catalog choose **All Catalogs**;
* in filter type: br.

Now its is expected you see in group id: *br.com.its.archetypes.angularjs*

* choose the archetype and go ahead clicking in next 

###What Do I do after creating project based on archetype?

**Step 4 Resolving dependency in module webapps-web**

This module has dependency of **webapps-core**. The archetype has default configuration, but you must update according to your project. Check the steps:

**Steps** 

* import maven project webapps-core and webapps-web for your IDE; 
* open webapps-web/pom.xml ;
* remove webapps-core 1.0.0 of dependency (its default of archetype and it does not work for your custom structure); 
* click in add; 
* type **webapps**; 
* Choose **webapps-core** according to  **groupId** that was defined when you created the project; 

**Testing**

If you did not change any  default configuration in pom.xml of the modules, now we can test. 

1. go to parent module and execute:

```java
mvn clean install 
```

2. now starting apps

```java
mvn tomcat:run
```

3. Access http://localhost:8080/webapps-web/

###How to custom? What should I change? 

Update thease files according to your configuration for project, such as: data base connection, packages names etc. There are comments where you should inform data. 

* app-context.xml 

* test-context.xml


###Conclusion 

webapps-module-angularjs was created to avoid and help to create JEE project using angularjs with basic structure with basic frameworks. Of course we can update, remove any framework that you do not need for you project. Feel free and send pull request. 


