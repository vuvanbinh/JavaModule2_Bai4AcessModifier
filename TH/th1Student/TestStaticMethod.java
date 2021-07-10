package bai5_AcessModifier.TH.th1Student;

import java.util.Scanner;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Scanner sc = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
        System.out.println(" So luong hoc sinh :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(" nhap ma hs : ");
            int rollono = sc.nextInt();
            System.out.println(" nhap ten hs :");
            String name = scc.nextLine();
            Student s = new Student(rollono,name);
            s.display();
        }

    }
}
