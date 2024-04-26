
The [Open/Closed Principle](https://en.wikipedia.org/wiki/Open/closed_principle), as originally formulated by [Bertrand Meyer](https://en.wikipedia.org/wiki/Bertrand_Meyer), states that **a given software entity should be open for extension, but closed for modification.** Essentially, any given class (or module, or function, etc) should allow for its functionality to be extended, but not allow for modification to its own source code. 
**Once written they should only be touched to fix errors**, new functionality should go into the new derived classes.

![](https://github.com/AmirTghizde/SOLID/blob/main/2.Open-ClosedPrinciple/Image.jpg)

**🤔Reasoning:** This principle encourages us to design our code in a way that allows for adding new functionality without modifying existing code. By doing so, we can avoid introducing bugs or unintended side effects in the existing codebase.

To adhere to the Open-Closed Principle, here are a few guidelines and practices to consider:

1.  😎Abstraction and Polymorphism: Use interfaces, abstract classes, and inheritance to create a flexible and extensible codebase. This allows you to define common behaviors and provide implementations for specific variations.
    
2.  💊Encapsulation: Hide internal implementation details behind well-defined interfaces. This way, you can change the implementation without affecting the consumers of the code.
    
3.  🔗⛓Dependency Injection: Use dependency injection to provide dependencies to classes instead of hardcoding them. This helps in decoupling modules and makes it easier to replace or extend dependencies.
    
4.  👷‍♂️Design Patterns: Utilize design patterns like Strategy, Decorator, and Factory to achieve extensibility while maintaining code cohesion and low coupling.
    
5.  🧪Unit Testing: Write comprehensive unit tests to ensure that adding new functionality doesn't break existing code. Tests act as a safety net, allowing you to confidently extend your codebase.

>[!IMPORTANT]
> I tried to come up with some few simple examples which you can find in this package

