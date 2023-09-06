# SAD-Project-T7 G23

# Introduction

Within this repository we implement a software module which takes care of compiling and executing Java test cases. The module should be included in an educational game that will aim to teach testing to players according to the ENACTEST project (European iNnovation AllianCe for TESting educaTion).

## Technologies

- OpenJDK (17)
- Maven (3.8.3)
- Junit (4 or 5)
- Jacoco (0.8.6)
- Spring Boot (3.1.0) - Spring Web

## Interface

We implemented REST API using the Spring Boot framework, with Spring Web as dependency. Below is the endpoint provided to request compilation and test execution by providing class to test and test class.

~/compexec  
**GET**  
**params:** *String* ClassName, *String* StudentLogin, *String* GameId  
**response:** *json* {"idResult" : int, "resMessage" : String, "pathCoverage" : String}  
**description:** Requires test cases to be compiled and executed by passing the parameters to retrieve the classes from the shared filesystem.  
**example:** http://localhost:8080/compexec?ClassName=AUTCalcolatrice&StudentLogin=1234&GameId=1  

~/compexecurl  
**POST**  
**params:** *String* ClassName, *String* StudentLogin, *String* GameId  
**body:** *json* {"urlClass" : String, "urlTestClass" : String}  
**response:** *json* {"idResult" : int, "resMessage" : String, "pathCoverage" : String}  
**description:** Requires test cases to be compiled and executed by passing the URLs to retrieve and save the classes into the filesystem.  
**example:** http://localhost:8080/compexecurl?ClassName=AUTCalcolatrice&StudentLogin=1234&GameId=1 + body  
