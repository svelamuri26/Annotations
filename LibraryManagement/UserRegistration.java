package org.startsteps.week7.LibraryManagement;

public class UserRegistration {

    public static void main(String[] args) {

        String name;
        int age;
        String emailId;

        User user1 = new User("John Doe", 25 , "JohnDoe@abc.com");
        User user2 = new User("Alice Smith " , 17 , "AliceSmith@abc.com");

        /*try {
            registerUser(user1);
            registerUser(user2);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }*/

    }

    @ValidateUser(minimumAge = 18, maximumBooks = 5)
    public static void registerUser(User user) throws NoSuchMethodException {
        ValidateUser validateUserAnnotation = UserRegistration.class
                .getDeclaredMethod("registerUser", User.class)
                .getAnnotation(ValidateUser.class);

        int minimumAge = validateUserAnnotation.minimumAge();
        int maximumBooks = validateUserAnnotation.maximumBooks();


        if (user.getAge() < minimumAge) {
            System.out.println("User is too young for registration.");
            return;
        }


        if (user.getAge() > maximumBooks) {
            System.out.println("User has reached the maximum books limit.");
            return;
        }

        System.out.println("User registered successfully:");
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("emailID: " + user.getemailID());
    }
}
