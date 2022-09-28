#INTEGER TO ROMAN NUMERAL


This is a REST service that converts an integer into a roman numeral. It provides a webpage with a form that consumes the roman numeral service.

Roman numerals only go up to M (1,000). According to the rules of addition and subtraction, this means that the biggest number we can form in Roman numerals is MMMCMXCIX, or 3,999. This application will take all numbers 0-3,999 and convert them to their proper roman numeral.

If a user enters '0', 'nulla' will be returned, which is the way Roman's referred to the number 0.

If a user enters any number other than 0 - 3,999 inclusive, an error message prompting the user to retry with a number between 0 - 3,999.

## Packaging 

When you run `mvn clean package` the frontend Vue application will build in the `dist` directory. 
The Maven plugin `maven-resources-plugin` will copy the contents of the build directory into `/target/static/classes`

## Deployment

The `system.properties` is a file I used for Heroku to set the Java version and deploy the application. 


Link to see it working live on Heroku:

(https://integer-to-roman-numeral.herokuapp.com/)



