// FILE: GetterTest.java

import lombok.*;

@Getter @Setter
public class GetterTest {
    private String name;
    private int age;

    static void test() {
        val obj = new GetterTest();
        GetterTest ref = obj.name("some").age(34);
        obj.name();
        obj.age();
    }

}


// FILE: test.kt

fun box(): String {
    val obj = GetterTest()
    val ref: GetterTest = obj.name("some").age(34)
    obj.name()
    obj.age()
   return "OK"
}

// FILE: lombok.config
lombok.accessors.fluent=true
#lombok.accessors.chain=false
