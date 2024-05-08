The [Single Responsibility Principle](https://en.wikipedia.org/wiki/Single_responsibility_principle) (SRP) states that **any class must have one, and only one, reason to change.** If a class has more than one reason to change, it should be refactored.

![](https://github.com/AmirTghizde/SOLID/blob/main/1.Single%20Responsibility%20Principle/Image.jpg)

🤔**Reasoning:** Each responsibility could be a reason to change a class in the future so basically:<br>

**Fewer responsibility = fewer opportunities to introduce new bugs during changes 👾**



**How does this principle help us to build better software?**  Let’s see a few of its benefits:

1.  🧪**Testing**  – A class with one responsibility will have far fewer test cases.
2.  🤝**Lower coupling**  – Less functionality in a single class will have fewer dependencies.
3.  📂**Organization**  – Smaller, well-organized classes are easier to search than monolithic ones.

