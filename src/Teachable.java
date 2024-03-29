
public interface Teachable {
}

/*
Default behavior of compilers : 
    anything under java.lang package is automatically imported 
    and no need for explicit import statement   
        for example : String class , System , Object 
    non-final fields of the class : 
        get default value of 0 (.0) for numbers , false for boolean 
        empty char for char , null for reference variable 
        int i = 'a' ; --->>> 97 ;   
    automatic type widening | upcasting 
        long l = 10  -->>> 10L ; 
    autoboxing | auto unboxing 
        Integer i1 = 10 ---->> new Integer(10) ; 
        int i2 = new Integer(12)  --->>> 12 ; 
    constructor : 
        if we don't define any constructor 
                -->> compiler will provide default no arg constructor 
               (as long as any constructor is defined we don't get one)
        first statement of any constructor is a call to super class;s 
        no arg cobstructor using super() 
               (as long as no other constructor call is made already)
    Inheritance : 
         if a class does not explicitly extends another class 
         it will implicitly extends Object class 
    Interface : 
        all the fields in interface are 
            automatically public static final 
            (and can not be marked with other access modifiers privte / protected)
        all the methods without body are automatically public abstract; 
        

}
*/