import java.lang.reflect.Method;

public class HubTester {
    public static void main(String[] args) {
        testStudent();
        System.out.println("");
        System.out.println("---------");
        System.out.println("");
        testHub();
    }

    public static void testStudent() {
        Student a1 = new Student("Jimmy", "Jombl101", "tim1@gmail.com");
        try {
            Student a = new Student("@", "Jimbo13!", "timmy1@email.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentional Error");
        }
        try {
            Student a = new Student("Jimmy", "Jimbo13!", "timmy1@email.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentional Error");
        }
        try {
            Student a = new Student(null, "jimbo123", "noName@gmeail.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentional Error");
        }
        try {
            Student a = new Student("Timmy", null, "timmy1@email.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentional Error");
        }
        try {
            Student a = new Student("Timmy", "1941817", "timmy1email.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentional Error");
        }
        try {
            Student a = new Student("Timmy", "1941817", "timmy1@emailcom");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentional Error");
        }
        try {
            Student a = new Student("Timmy", "1941817", "timmy1email.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentional Error");
        }
    }

    public static void testHub() {
        Hub newHub = new Hub();
        newHub.registerStudent("Bimmy", "12345678", "bimmy1@gmail.com");
        newHub.registerStudent("Waldo", "155235", "waldo1@gmail.com");
        try {
            newHub.loginStudent("Jimmy", "1231241");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentional Error");
        }
        try {
            newHub.loginStudent("Bimmy", "1231241");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentional Error");
        }
        try {
            newHub.doesStudentExist("Bimmy");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentional Error");
        }
        try {
            newHub.ensureStudentDoesNotExist("Bimmy");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentional Error");
        }
        try {
            newHub.requireNotBlank("", "name");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentional Error");
        }
        try {
            newHub.requireNotBlank(null, "name");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentional Error");
        }
        try {
            newHub.requireEmail("the.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentional Error");
        }
        try {
            newHub.requireEmail("@thecom");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Intentional Error");
        }
    }
}
