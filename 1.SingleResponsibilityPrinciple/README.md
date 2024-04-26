Let’s begin with the single responsibility principle. As we might expect, this principle states that  **a class should only have one purpose/responsibility. Furthermore, it should only have one reason to change.**

🤔**Reasoning:** Each responsibility could be a reason to change a class in the future. Fewer responsibility = fewer opportunities
to introduce new bugs during changes 👾

**How does this principle help us to build better software?**  Let’s see a few of its benefits:

1.  🧪**Testing**  – A class with one responsibility will have far fewer test cases.
2.  🤝**Lower coupling**  – Less functionality in a single class will have fewer dependencies.
3.  📂**Organization**  – Smaller, well-organized classes are easier to search than monolithic ones.

>[!IMPORTANT]
> I tried to come up with some few simple examples which you can find in this package
