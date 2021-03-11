import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyClassTest {


    @Test
    void checkPassword_toSmall() {
        System.out.println("lenght1");
        Boolean actual = MyClass.password("abcd");
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPassword_toLong() {
        System.out.println("lenght2");
        Boolean actual = MyClass.password("abcdefghijklmnopqrstuvwxyz");
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPassword_letters() {
        System.out.println("Letters");
        Boolean actual = MyClass.password("AbCdE");
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPassword_containsNumbers() {
        System.out.println("Numbers");
        Boolean actual = MyClass.password("123456");
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPassword_containsSpecialcharacter() {
        System.out.println("allowed special character");
        Boolean actual = MyClass.password("()#$?!%/@");
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPassword_containsSpecialcharacter2() {
        System.out.println("not allowed special character");
        Boolean actual = MyClass.password("[]{|}.,&:;<=>");
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPassword_extensions() {
        System.out.println("Extensions");
        Boolean actual = MyClass.password("123");
        Assertions.assertFalse(actual);
    }
    @Test
    void checkPassword_extensions2() {
        System.out.println("Extensions 2");
        Boolean actual = MyClass.password("3333");
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPassword_combined() {
        System.out.println("combined");
        Boolean actual = MyClass.password("gyxbfa3");
        Assertions.assertFalse(actual);
    }
    @Test
    void checkPassword_combined2() {
        System.out.println("combined2");
        Boolean actual = MyClass.password("M3wK5I@t");
        Assertions.assertTrue(actual);
    }
    @Test
    void checkPassword_combined3() {
        System.out.println("combined3");
        Boolean actual = MyClass.password("#7rQ&$yp7VclQPjVw@HaAEWbN3tfqd");
        Assertions.assertFalse(actual);
    }
    @Test
    void checkPassword_combined4() {
        System.out.println("combined3");
        Boolean actual = MyClass.password("Passwort123");
        Assertions.assertFalse(actual);
    }
    @Test
    void checkPassword_combined5() {
        System.out.println("combined3");
        Boolean actual = MyClass.password("1111passwort");
        Assertions.assertFalse(actual);
    }








}



