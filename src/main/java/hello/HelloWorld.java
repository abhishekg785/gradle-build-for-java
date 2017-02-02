package main.java.hello;

import org.joda.time.LocalTime;

/**
 * Created by hiro on 2/2/17.
 *
 * getting current time using joda lib which dependency has been defined in
 * the build.gradle file and will be handled from there making our life easy :)
 */

public class HelloWorld {
    public static void main(String args[]) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current time is :" + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
