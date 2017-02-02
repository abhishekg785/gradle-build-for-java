#Gradle makes Life easy :)

Gradle is a modern Open Source Build Tool for Continuous Delivery.<br/>
Build Tools : Build tools are programs that automate the creation of executable applications from source code.

So i will be using gradle for automating my Java Stuff. (a simple HelloWorld Java class )

Now to run the project all i have to do is :

Clone the repo first into my local machine using git clone.

Install Gradle, but this is not required as i am using the gradle wrapper that gives us a gradlew to use for the same purpose and thus no requirement of gradle.

Magic happens in the build.gradle file :) <br/>
It consists the data such as : <br/>
Dependencies and repos of the the third party libs being used in the project.  <br/>
The name of the main class to build. <br/>
The name and the version of the jar file to create for our project. <br/>
and a lots more ... <br/>

Run the command 

    ./gradlew build

or 
    gradle build 
    
( need installed gradle)
    
will build the project for you creating a build dir containing all the compiled java classes inside it and some other stuff.

Run the command

    ./gradlew run
    
or 
    gradle run
     
( need installed gradle)
   
This will run the main java file of the project.

Gradle is awesome when it comes to automate the stuff. <br/>
It might not seem very useful here , but for big projects having a lot of dependencies and libs , it makes a lot easier to build and run things :)

Gradle is cool :)
