package com.example.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
public class SecondService {
    private   SecondClass secondClass;
    @Value("${my.prop}")
    private String customPropertyFromAnotherFile;

@Autowired
  public void  mySecondClass(
          @Qualifier("newSecondClass") SecondClass secondClass){
            this.secondClass=secondClass;
  }
public  String SecondStory(){
      return "This is Second Story " + secondClass.Hello();
 }

    public String getCustomPropertyFromAnotherFile() {
        return customPropertyFromAnotherFile;
    }
}
