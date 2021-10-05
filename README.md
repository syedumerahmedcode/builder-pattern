# builder-pattern

## Table of content
- [Introduction](#introduction)
- [Explanation Builder Pattern](#explanation-builder-pattern)
- [Technologies Used](#technologies-used)
- [References](#references)
- [Contribution](#contribution)
- [Contact Information](#contact-information)

## Introduction

This project uses builder pattern to create Objects. In this example, a custom Pizza is created for a restaurant using the Builder Pattern. The following enums represent various aspects of a Pizza:

- **Base.java**: Defines the base of the pizza.
- **Cheese.java**: Defines the type of cheese for the Pizza.
- **Crust.java**: Defines the type of crust for the Pizza.
- **Size.java**: Defines the size (i.e. diameter) of the Pizza.
- **Toppings.java**: Defines the kinds of toppings that are available for the Pizza.

All of the above enums are defined as fields in **Pizza.java** class. It also contains the **PizzaBuilder** class which is static and it contains the core logic for the builder pattern. The individual components are returned as _PizzaBuilder_ object according to the following pattern:

```java 
public PizzaBuilder crust(Crust crust) {
			this.crust = crust;
			return this;
		}
```
In the above example, _Crust_ is returned. Same logic applies for _Base_,_Cheese_ and _toppings_. Eventually, one can call _build()_ method to return the Pizza object as shown below:

```java
public Pizza build() {
			return new Pizza(this);
		}
```
 

## Explanation Builder Pattern

The _Builder Pattern_ is one of the _GoF design pattern_ that describes how to solve recurring design problems in object oriented software. The main aim of the Builder design pattern is to separate the construction of complex object from its representation. The main problems that this pattern solves  are:

-  Encapsulate creating and assembling the part of a complex object in a separate Builder object. In our project, it is done via **static class PizzaBuilder**.
- In this way, the class delegates the creation to a _Builder_ object instead of creating the objects directly. That means that in our project, we **do not call** _new Pizza()_.  

Using this pattern removes the need to call **_new_** operator on a class and the same construction process can create different representations.

**Advantages**

- Provides control over steps of construction process.
- Allows us to vary a product's internal representation.
- Allows us to dynamically create objects however we want to.

**Practical Experience**

I used this pattern in a base class which provided different test objects based on different test requirements.  


## Technologies Used

- Java 11


## References

- [1](https://en.wikipedia.org/wiki/Builder_pattern): Builder pattern
- [2](https://www.youtube.com/watch?v=M7Xi1yO_s8E): Builder Pattern - Design Patterns **(Youtube)**

## Contribution

Feature requests, issues, pull requests and questions are welcome.



## Contact Information

How to reach me? At [github specific gmail account](syed.umer.ahmed.code@gmail.com). Additionally, you can reach me via [Linkedin](https://www.linkedin.com/in/syed-umer-ahmed-a346a746/) or at [Xing](https://www.xing.com/profile/SyedUmer_Ahmed/cv).


