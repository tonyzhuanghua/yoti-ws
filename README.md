# yoti-ws

Restful resource  defined in web.xml pointing to RestApplication.java.  

### Dependencies

- GlassFish 4.1.2
- JDK 1.8
- Jersey 2
- More please check pom.xml

### Main Logic
Please check comments in CleanOperation.java and ActionBiz.java

- ActionBiz.java: fulfills web service request/response logic
- CleanOperation.java: fulfills the operation logic

### Test

Use Postman for the web service test

- Please deploy with GlassFish before test

- There is also a junit test class, please run "mvn clean test"
