package com.icortex.annotations;
import java.lang.annotation.*;
public class Testable {
    public void execute(){
        System.out.println("Executing...");
    }
    @Test
    void testExecute(){
        
    }
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Test{

    }
}
