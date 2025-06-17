package D03_Encapsulation;
//Mobile Phone Lock System
//Task:
//Class Phone with private boolean isLocked.
//Create lock() and unlock() methods.
//Use checkLockStatus() to know whether phone is locked or not.
//✔ Goal: Understand encapsulation with boolean flags

public class PhoneLockSystem {
    private boolean isLocked;

    public void lock() {
        if (!isLocked) {
            isLocked = true;
            System.out.println("Phone is lock");

        } else {
            System.out.println("Phone is already lock");


        }

    }

    public void unlock() {
        if (isLocked) {
            isLocked = false;
            System.out.println("Phone is unlock");

        } else {
            System.out.println("Phone is already unlock");


        }
    }

    public void checkLockStatus() {
        if (isLocked) {
            System.out.print("phone is lock");
        } else {
            System.out.print("phone is unlock");

        }
    }

    public static void main(String[] args) {
        PhoneLockSystem phoneLockSystem = new PhoneLockSystem();
        phoneLockSystem.checkLockStatus();
        phoneLockSystem.unlock();
        phoneLockSystem.checkLockStatus();

        phoneLockSystem.unlock();

        phoneLockSystem.lock();
        phoneLockSystem.checkLockStatus();
    }
}