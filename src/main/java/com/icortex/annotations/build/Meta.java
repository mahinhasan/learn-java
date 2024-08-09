package com.icortex.annotations.build;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

public class Meta{

    @MyAnno(str = "Anno example",val = 100)
    public static void myMeth(){
        Meta ob = new Meta();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno myAnno = m.getAnnotation(MyAnno.class);
            System.out.println(myAnno.str() + " "+myAnno.val());


        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }

}
