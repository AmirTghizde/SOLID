
The [Liskov Substitution Principle](https://en.wikipedia.org/wiki/Liskov_substitution_principle)(LSP), named for and originally defined by [Barbara Liskov](https://en.wikipedia.org/wiki/Barbara_Liskov), states that **we should be able to treat a child class as though it were the parent class**. This means that objects of a superclass should be replaceable with objects of its subclasses without altering the correctness of the program. In other words, if a class is a subtype of another class, it should be able to be used interchangeably with its superclass without causing any issues.. The LSP is very similar in principle to the [Open/Closed Principle](https://github.com/AmirTghizde/SOLID/tree/main/2.Open-Closed%20Principle).

![](https://github.com/AmirTghizde/SOLID/blob/main/3.Liskov%20Substitution%20Principle/Image.jpg)

**🤔Reasoning:** This principle aims to keep functionality intact. It's main purpose is to guarantee that objects lower in a relational hierarchy can be treated as though they are objects higher in the hierarchy. Basically, any child class should be able to do anything the parent can do.

By adhering to the Liskov Substitution Principle, we can ensure that our code is robust, maintainable, and flexible. Here are a few ways it can help us build better software:

1.  🐓🐤Subtype Consistency: When designing subclasses, they should adhere to the same behavior and contracts defined by the superclass. This means that any methods overridden in the subclass should respect the preconditions, postconditions, and invariants of the superclass.
    
2.  👮‍♂️Avoiding Violations: Violating the Liskov Substitution Principle can lead to unexpected runtime errors or incorrect behavior. By following the principle, we can reduce the likelihood of such issues and ensure that our code is reliable.
    
3.  ♻Promoting Code Reuse: The LSP encourages the creation of reusable and interchangeable code. By designing classes that are substitutable, we can leverage the benefits of inheritance and polymorphism, allowing for more flexible and extensible code.
    
4.  ✅Design by Contract: Applying the Liskov Substitution Principle is closely related to the concept of Design by Contract. It emphasizes the importance of defining clear contracts (preconditions, postconditions, and invariants) for classes and their subclasses, promoting better code documentation and understanding.

   >[!NOTE]
> I tried to come up with some few simple examples which you can find in this package
