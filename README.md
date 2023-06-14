# lcm-calculator
The goal of the project is to determine the smallest positive number that can be divided by a sequential range of numbers (from 1 to 25)
without remainder. 
This project was developed with Spring Boot framework.
# What does it contain?
Project contains rest controllers, service, exceptions, test classes.
Postman collection is created to use this API. You can find postman collection in `lcm-calculator` folder.
Docker file is prepared to build docker image to publish a container.
# How to build?
You can build application with maven and jdk-17.
You can build with this command while using terminal `mvn clean install wrapper:wrapper`.
# How to run?
You can run application as a docker container using DockerFile. 
create docker image:
`docker build . -t lcm-calculator:1.0`
run docker image:
`docker run --name lcm-calculator -d -p 8080:8080 lcm-calculator:1.0`
# How to test?
Sample tests are implemented for classes using mockito and junit. You can run these test cases.
You can also start application in localhost, and you can send a request to test it.
While testing the application, first step you set upper number value. 
First, you need to send get request to set the value for instance; `localhost:8080/api/upperNumber` with
```
{
    "upperNumber": 15
}
```
then, you can get least common multiple with this post request `localhost:8080/api/calculate`. 
When you send this request, application will return such a this response:
```
{
    "upperNumber": 15,
    "result": 360360,
    "elapsedTimeInNanoSec": 1690200
}
```
This application finds the least common factor of positive numbers. 
If you send a different number, the calculation is not performed and throws an exception.
If you want to test it, you can send this request `localhost:8080/api/upperNumber` with 
```
{
    "upperNumber": 0
}
```
When you send this request, application returns bad request with this message :
```
{
    "timestamp": "2023-06-07T22:19:02.438+00:00",
    "status": 400,
    "error": "Bad Request",
    "message": "Upper number is out of bound! valid between [1:25]",
    "path": "/api/upperNumber"
}
```
Before sending this request `localhost:8080/api/calculate`, you have to set upper number value.
If you don't send this first, the calculation isn't performed and throws an exception.
```
{
    "timestamp": "2023-06-07T22:23:09.408+00:00",
    "status": 400,
    "error": "Bad Request",
    "message": "Upper number hasn't been set!",
    "path": "/api/calculate"
}
```




