package javaprograms;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Resume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for resume information
        System.out.println("Resume Builder");
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your contact information: ");
        String contactInfo = scanner.nextLine();

        System.out.println("Enter your education background:");
        System.out.print("Degree: ");
        String degree = scanner.nextLine();

        System.out.print("School/University: ");
        String school = scanner.nextLine();

        System.out.print("Graduation Year: ");
        String graduationYear = scanner.nextLine();

        System.out.println("Enter your work experience:");
        System.out.print("Job Title: ");
        String jobTitle = scanner.nextLine();

        System.out.print("Company: ");
        String company = scanner.nextLine();

        System.out.print("Work Duration: ");
        String workDuration = scanner.nextLine();

        // Generate the resume
        StringBuilder resume = new StringBuilder();
        resume.append("Resume\n\n");
        resume.append("Name: ").append(name).append("\n");
        resume.append("Contact: ").append(contactInfo).append("\n\n");
        resume.append("Education:\n");
        resume.append(" - Degree: ").append(degree).append("\n");
        resume.append(" - School/University: ").append(school).append("\n");
        resume.append(" - Graduation Year: ").append(graduationYear).append("\n\n");
        resume.append("Work Experience:\n");
        resume.append(" - Job Title: ").append(jobTitle).append("\n");
        resume.append(" - Company: ").append(company).append("\n");
        resume.append(" - Work Duration: ").append(workDuration).append("\n");

        // Display the generated resume
        System.out.println("\nGenerated Resume:\n");
        System.out.println(resume.toString());

        // Save the resume to a text file
        try (FileWriter writer = new FileWriter("resume.txt")) {
            writer.write(resume.toString());
            System.out.println("Resume saved to 'resume.txt'");
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}