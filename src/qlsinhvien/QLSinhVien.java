/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlsinhvien;

import Entity.Lecturer;
import Entity.Student;
import java.util.Scanner;
import java.time.LocalDate;

/**
 *
 * @author NamHV
 */
public class QLSinhVien {

    /**
     * @param args the command line arguments
     */
    public static void displayStudentMenu() {
        System.out.println("1.	Add new student");
        System.out.println("2.	View all students");
        System.out.println("3.	Search students");
        System.out.println("4.	Delete students");
        System.out.println("5.	Update student");
        System.out.println("6.	Back to main menu");
        System.out.println("=======================");
        System.out.print("Please choose: ");
    }

    public static void displayLecturerMenu() {
        System.out.println("1.	Add new lecturer");
        System.out.println("2.	View all lecturers");
        System.out.println("3.	Search lecturers");
        System.out.println("4.	Delete lecturers");
        System.out.println("5.	Update lecturer");
        System.out.println("6.	Back to main menu");
        System.out.println("=======================");
        System.out.print("Please choose: ");
    }

    public static void displayMenu() {
        System.out.println("1.	Manage Students");
        System.out.println("2.	Manage Lecturers");
        System.out.println("3.	Exit");
        System.out.println("=======================");
        System.out.print("Please choose: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentMangagement stdmng = new StudentMangagement();
        LecturerManagement ltrmng = new LecturerManagement();
        int choose;
        do {
            displayMenu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    do {
                        displayStudentMenu();
                        choose = sc.nextInt();
                        switch (choose) {
                            case 1:
                                sc.nextLine();
                                System.out.println("Enter student information: ");
                                System.out.print("Name: ");
                                String name = "";
                                name += sc.nextLine();

                                System.out.print("Email: ");
                                String email = "";
                                email += sc.nextLine();

                                System.out.print("Address: ");
                                String address = "";
                                address += sc.nextLine();

                                Student std = new Student();
                                std.setName(name);
                                std.setEmail(email);
                                std.setAddress(address);
                                stdmng.list.add(std);
                                break;
                            case 2:
                                stdmng.display();
                                break;
                            case 3:
                                sc.nextLine();
                                System.out.print("Enter student name: ");
                                String search = "";
                                search += sc.nextLine();
                                stdmng.search(search);
                                break;
                            case 4:
                                sc.nextLine();
                                System.out.print("Enter student id: ");
                                String delete = "";
                                delete += sc.nextLine();
                                stdmng.delete(delete);
                                break;
                            case 5:
                                sc.nextLine();
                                System.out.println("Enter student information: ");
                                System.out.print("Name: ");
                                String name2 = "";
                                name2 += sc.nextLine();

                                System.out.print("Email: ");
                                String email2 = "";
                                email2 += sc.nextLine();

                                System.out.print("Address: ");
                                String address2 = "";
                                address2 += sc.nextLine();

                                Student std2 = new Student();
                                std2.setName(name2);
                                std2.setEmail(email2);
                                std2.setAddress(address2);
                                stdmng.list.add(std2);
                                break;
                        }
                    } while (choose != 6);
                    break;
                case 2:
                    do {
                        displayLecturerMenu();
                        choose = sc.nextInt();
                        switch (choose) {
                            case 1:
                                sc.nextLine();
                                System.out.println("Enter student information: ");
                                System.out.print("Name: ");
                                String name = "";
                                name += sc.nextLine();

                                System.out.print("Email: ");
                                String email = "";
                                email += sc.nextLine();

                                System.out.print("Address: ");
                                String address = "";
                                address += sc.nextLine();

                                Lecturer std = new Lecturer();
                                std.setName(name);
                                std.setEmail(email);
                                std.setAddress(address);
                                ltrmng.list.add(std);
                                break;
                            case 2:
                                ltrmng.display();
                                break;
                            case 3:
                                sc.nextLine();
                                System.out.print("Enter student name: ");
                                String search = "";
                                search += sc.nextLine();
                                ltrmng.search(search);
                                break;
                            case 4:
                                sc.nextLine();
                                System.out.print("Enter student id: ");
                                String delete = "";
                                delete += sc.nextLine();
                                ltrmng.delete(delete);
                                break;
                            case 5:
                                sc.nextLine();
                                System.out.println("Enter student information: ");
                                System.out.print("Name: ");
                                String name2 = "";
                                name2 += sc.nextLine();

                                System.out.print("Email: ");
                                String email2 = "";
                                email2 += sc.nextLine();

                                System.out.print("Address: ");
                                String address2 = "";
                                address2 += sc.nextLine();

                                Lecturer std2 = new Lecturer();
                                std2.setName(name2);
                                std2.setEmail(email2);
                                std2.setAddress(address2);
                                ltrmng.list.add(std2);
                                break;
                        }
                    } while (choose != 6);
                    break;
                default:
                    System.out.println("Choose invalid");
            }
        } while (choose != 3);
    }
}
