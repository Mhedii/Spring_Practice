//package com.example.example;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.core.env.Environment;
//import org.springframework.stereotype.Service;
//
//@Service
//public class MyFirstService {
//
//    //    *****Constructor injection is highly recommended over field Injection
//    //    private final FirstClass myFirstClass;
//    //Constructor Injection
//    //    public MyFirstService(
//    ////           @Qualifier("bean2") FirstClass myFirstClass) {
//    // FirstClass myFirstClass) {
//    //        this.myFirstClass = myFirstClass;
//    //    }
//
//
//    //Field Injection
//    //    @Autowired
//    //    @Qualifier("secondClass")
//    //    private   FirstClass myFirstClass;
//
//
//
//    //    Method Injection
//    //    private   FirstClass myFirstClass;
//    //    @Autowired
//    //    public  void injectDependecies(@Qualifier("secondClass") FirstClass myFirstClass){
//    //        this.myFirstClass=myFirstClass;
//    //    }
//
//
//
//    //    Setter Injection
//    //    private   FirstClass myFirstClass;
//    //    @Autowired
//    //    public  void setMyFirstClass(@Qualifier("secondClass") FirstClass myFirstClass){
//    //        this.myFirstClass=myFirstClass;
//    //    }
//
//    //    Special bean
//    private FirstClass myFirstClass;
//    private Environment environment;
//
//    @Autowired
//    public void setMyFirstClass(@Qualifier("secondClass") FirstClass myFirstClass){
//        this.myFirstClass=myFirstClass;
//    }
//    public  String tellAStory(){
//        return "this is " + myFirstClass.Hello();
//    }
//    public  String getJavaVersion(){
//        String javaVersion = environment.getProperty("java.version");
//        String OSVersion=environment.getProperty("os.name");
//        return "The Java Version is : " + javaVersion + " and the OS Version is : " + OSVersion;
//    }
//    public  String ReadProp(){
//        return  "The Custom Property is : "+environment.getProperty("my.custom.property");
//    }
//    @Autowired
//    public void setEnvironment(Environment environment) {
//        this.environment = environment;
//    }
//}
//
