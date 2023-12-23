# PROJECT VOLKSWAGEN GRAND CALIFORNIA
![Logo](/images/logo.png)

# Overview
Volkswagen Grand California is an educational project based on Kotlin, aimed at practicing modular programming, code documentation, and becoming familiar with the GitHub environment, in the Catalan language.

<img src="images/main.png" alt="Overview" width="600"/>

<a id = "toc"></a>
# Table of contents
1.[Project Description](#project-description)
2.[How to Install and Run the Project](#install)
3.[Project Execution](#execution)
4.[Summary](#summary)

<a id = "project-description"></a>
# Project Description
This application assumes that you are a user of a Volkswagen Grand California and offers to calculate its price when you want to sell it as a used vehicle. The application utilizes various functions to determine the final price, such as the vehicle's mileage, tire wear, whether it has a bike rack, etc. In the end, the program will advise you on how much money it recommends listing it for in the used car market and provides a breakdown of the calculations performed.

<img src="images/calculate.png" alt="CodeImage1" width="600"/>


The application relies on a file of functions to display various interaction [menus](/src/main/kotlin/functionsMenu.kt) with the user, a file for all functions related to [price calculation](/src/main/kotlin/functionsCalculate.kt), and another file with more [generic functions](/src/main/kotlin/functionsVW.kt) related to the purpose of the application. Additionally, two support files are included—one that provides quick and simple functions for [coloring](/src/main/kotlin/ConsoleColors.kt) console output, and another support file with [useful functions](/src/main/kotlin/Utilities.kt) for keyboard input, data validation, etc.

<img src="images/colors.png" alt="CodeImage2" width="600"/>

<a id = "install"></a>
# How to Install and Run the Project
Here, I'll show you how you can install and run it on your own machine.

## Prerequisites
Before you begin, make sure you have the following installed on your machine:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Kotlin](https://kotlinlang.org/docs/tutorials/command-line.html)

## Installation Steps

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/your-project.git
   cd your-project
   ```
2. **Compile the Project:**
   ```bash
   kotlinc -include-runtime -d your-project.jar src/main/kotlin/*.kt
   ```
3. **Run the Application:**
   ```bash
   java -jar your-project.jar
   ```
- Another option is to import the repository into your favorite IDE. For optimal import and execution, it is recommended to use IntelliJ with Gradle

<a id="execution"></a>
# Project Execution
Run the project and follow the on-screen instructions.

<img src="images/execution2.png" alt="CodeImage3" width="600"/>

Don't worry if you enter the data incorrectly; the application has everything planned for that.

<img src="images/executionErrors.png" alt="CodeImage3" width="600"/>

In the end, you will obtain the result of the function based on the inputs you provided to the application.

<img src="images/execution.png" alt="CodeImage3" width="600"/>

---
<a id="summary"></a>
## Thank You for Exploring!

I hope you enjoyed exploring this project as much as I did creating it. Throughout this journey, I've become more acquainted with the GitHub environment and mastered various Git commands. I've refined my understanding of modular programming concepts and embraced Kdoc, a widely recognized industry standard for code documentation.

Looking forward to our paths crossing again in future, in more intricate projects.

Happy coding!
---
[Go back to Table of contents](#toc)
