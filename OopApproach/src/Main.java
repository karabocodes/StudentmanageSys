import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Admin> adminList = new ArrayList<>();
        List<Mentor> mentorList = new ArrayList<>();

        // Input for Admin
        System.out.println("Enter Admin Details:");
        Admin admin = Admin.createAdmin();
        adminList.add(admin);

        // Input for Mentor
        System.out.println("\nEnter Mentor Details:");
        Mentor mentor = Mentor.createMentor();
        mentorList.add(mentor);

        // Displaying Admin and Mentor information
        System.out.println("\nAdmin Details:");
        for (Admin a : adminList) {
            System.out.println("Username: " + a.getUsername() + ", Password: " + a.getPassword());
        }

        System.out.println("\nMentor Details:");
        for (Mentor m : mentorList) {
            System.out.println("Name: " + m.getName() + ", Age: " + m.getAge() +
                    ", Address: " + m.getAddress() + ", Username: " + m.getUsername() +
                    ", Password: " + m.getPassword());
        }
    }
}
