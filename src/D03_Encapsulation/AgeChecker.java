package D03_Encapsulation;
//3. Person Age Checker
//Task:
//Class Person with private age.
//Allow age setting only if it’s between 1 and 120 using a setter.
//Print the age using a getter.
//✔ Goal: Validate data using setter to ensure safe data.

public class AgeChecker {
    private int age;

    public void setAge(int age){
        if(age>=1 && age<=120) {
            this.age = age;
        }else{
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }
        public static void main(String[] args) {
        AgeChecker ageChecker=new AgeChecker();
        ageChecker.setAge(20);
            System.out.println(" Person's age: " + ageChecker.getAge());

            ageChecker.setAge(-5);
            ageChecker.setAge(150);
            ageChecker.setAge(50);


            System.out.println("Final age stored:" + ageChecker.getAge());



        }
}
