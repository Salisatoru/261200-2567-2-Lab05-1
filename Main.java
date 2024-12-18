public class Main {
    public static void main(String[] args) {
        // Step 2: Create and test a User instance
        User john = new User("John", 1954, 2, 18);
        john.displayInfo();

        System.out.println();

        // Step 4: Create and test an Admin instance
        Admin nicolas = new Admin("Nicolas", 1964, 1, 7);
        nicolas.displayInfo();
        System.out.println();
        nicolas.displayInfo(true);
        System.out.println();
        nicolas.displayInfo(false);
    }
}
