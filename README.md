# 1. Reflections 

## 1.1 Computer mouse 

Identify the type of testing you would perform on a computer mouse, to make sure that is is of the highest quality

I would try the following testing: 

**Quality testing**

- Ensure that the mouse felt like a quality piece of work
- Ensure that the buttons on the mouse worked when clicked

**Precision testing**

- Find a way to make the mouse as precise as possible, e.g using laser or something else. Making a comparative analysis and then deciding. 

**Rage quit testing**

- Investigate how robust the mouse is when thrown. Gamers have a habit of throwing stuff. 


## 1.2 Catastrophic failure 

Find a story where a software system defect had a bad outcome. Describe what happened. Can you identify a test that would have prevented it? 

**Horror story**

The rocket Ariane 5 from European Space Agency that exploded just forty seconds after being launched from the Kourou in the French Guiana. 

When the rocket exploded it was on it's first voyage.
The development of the rocket costed 8 billion dollars and the result of the bug was a loss of 370 million dollars. 

The reason behind this bug was an integer overflow where an attempt was made to set a 64-bit number in 16-bit space. 

**Identify a test to prevent it** 

To prevent the integer overflow and eventually the massive explotion I would have ensured that there was a continious integrations test environment. 

I do also expect that when working with such a huge piece of hardware that it should be possible to do some modelling and asses whether the created software works on the model beforehand. 

I assume a basic unit test could prevent the error by verifying whether or not the integer input was in the 16-bit format or 64-bit format. 

# 2 Two katas 

## 2.1 String Utility 

I implemented the solutions using BDD and did not use any part of the String methods in achieving the functionality. 
However I could not find a way to do it without using the Character-types build in functions. 
I do assumme that is acceptable. 

I found it hard to create more than the test cases that I came up with. Suggestions is very welcome! Thanks. 

## 2.2 Bowling game 

Solution implemented using JUnit. Had some minor troubles with the file structure and packaging so the `bowlingGame` class is in same location as the `bowlingGameTest`. 
This all had to do with my Cucumber Setup for the first katar. 
Sorry for the confusion. 

# 3 Investigation of tools 

## 3.1 JUnit 5 


- **@Tag**: 
Used to declare tags for filtering tests, either at class or method level. Inhertied at class level but not method level. 
- **@Disabled**:
Used to disable a test class or test method. Not inherited. 
- **@RepeatedTest**: 
Makes the test a template to create repeated tests. Methods are inherited unless they are overridden. 
- **@BeforeEach, @AfterEach**
Denotes that method should be run before or after every test in current class. 
- **@DisplayName**
Declares a custom display name for test class or test method. Not inherited. 
- **@Nested** 
Denotes that it is a non static nested test class. Gives user capability to express relationsship among several groups of tests. 
@BeforeAll and @AfterAll cannot be used. 
- **assummeFalse, assummeTrue** 
If called with something evalution the reverse of expected the test will be halt and ignored. 

## 3.2 Mocking Frameworks

I have choosen to compare Mockito and EasyMock

- What are their similarities? 

Mocking frameworks using the @Mock annotation to define mocks in the code. 

- What are their differences? 

EasyMock has to call the method replay(mock) each time you would like to use a mock or an exception will be thrown. 

Mockito has special annotion for mocks and they can be reused. 

- Which one would you prefer to use? 

Since I know more about Mockito, from class and from homework, I would choose to utilize Mockito. It does also seem that Mockito has a bigger community and a bigger following making it easier to find support and or help if struggling to utilize the many opportunities from Mockito. 
 
