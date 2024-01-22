import java.util.Scanner;

public class Mentor {
    private String name;
    private int age;
    private String address;
    private String username;
    private String password;

    public Mentor(String newName, int newAge, String newAddress, String username, String password) {
        name = newName;
        age = newAge;
        address = newAddress;
        this.username = username;
        this.password = password;
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
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getters and setters

    // Other Mentor-specific methods can be added here

    public static Mentor createMentor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter mentor name: ");
        String name = scanner.nextLine();

        System.out.print("Enter mentor age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter mentor address: ");
        String address = scanner.nextLine();

        System.out.print("Enter mentor username: ");
        String username = scanner.nextLine();

        System.out.print("Enter mentor password: ");
        String password = scanner.nextLine();

        return new Mentor(name, age, address, username, password);
    }
}
