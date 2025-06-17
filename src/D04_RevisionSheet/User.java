package D04_RevisionSheet;
//🔹 1–10: Encapsulation & Access Modifiers

//1.	Create a User class with private fields and public getter/setter methods.
 class User {
    private String name;
    private int age;
    private String email;


    public User( String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email");
        }
    }

    public void display() {
        System.out.println("User Info:");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Email : " + email);
    }
    public class Main {
        public static void main(String[] args) {
            User user = new User("Shristi", 24, "@shriigmail.com");
            user.display();

            user.setAge(24);
            user.setName("Muskan");
            user.setEmail("@Shrii.gmail.com");
            System.out.println("\nUpdated User Info:");
            user.display();
        }


        }

}