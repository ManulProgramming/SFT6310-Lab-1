# SFT6310 Lab 1

Self-explanatory. In this task, we needed to create a simple Spring Boot application which would print out "Hello World!"
in a form of a webpage. The completed task also includes some additional ... things implemented, just for the
experimentation sake.

## Classes

This project includes three classes total:
- HelloApplication.java: a starting point that will launch the app itself using Spring;
- APIController.java: a RestController responsible for providing responses in form of string or dictionary/json/hashmap;
- THController.java: now that's a good one. It is a Thymeleaf controller which instead of providing responses, would
return a whole HTML template file.

### HelloApplication

There is not a lot to say about this one. It is just a typical Java starting point that uses a classical
`public static void main(String[] args)` to launch a SpringApplication with arguments provided during launch.

### APIController

In here we map all the responses to specific parts of the URL of /api.

Hello function returns a string "Hello World";

Status function will return a HashMap containing a status code (just the number 200), a message ("Hello World") and 
a timestamp (current time in milliseconds);

Index function will just return a string notifying the user about /api/hello
and /api/status webpages.

### THController

As stated previously, this uses Thymeleaf to return an HTML template, while also passing some variables to it beforehand.
This works similarly to Jinja2 in Python, and that's why I wanted to experiment with it.

An HTML file is just a simple page that uses Bootstrap framework for design purposes and ease of implementation. It contains
a carousel to contain multiple "pages" of data that will be passed by Java in form of a list. To do this it uses TH 
syntax to pass arguments (`th:something="${variable}"`)and also to use them in if-expressions (`th:if="${condition}"`,
or in this case `th:something="${condition ? True : False}"`) and for-loops (`th:each="var, stat : ${variables}"`).

## Installation

The application was tested and developed on Java 25 with Gradle and Windows 11, other versions were not tested.

Clone the repository on both servers from git clone: [https://github.com/ManulProgramming/SFT6310-Lab-1](https://github.com/ManulProgramming/SFT6310-Lab-1).

Go to the /SFT6310-Lab-1 and build the Java application using IntelliJ Idea or manually by using build.gradle.

## Usage

Run the application and go to localhost:8080 to see different webpages.

## Notes:

This application is created for educational purposes only. It should not be considered as a serious application,
but rather as a completed Laboratory work for this course.

## License:

[Apache2](https://github.com/ManulProgramming/SFT6310-Lab-1/blob/main/LICENSE)