package demo_static;

//import java.util.Scanner;
//
//import java.util.Scanner;
//import tham_chieu_tham_tri.Student;

//import tham_chieu_tham_tri.Student;

import tham_chieu_tham_tri.Student;

import java.util.Scanner;
public class TestDemoStatic {
    Student student = new Student(1); //Phím Alt + Enter
    private static int  a = 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number static ---> "+DemoStatic.number);
//        DemoStatic.methodStatic();
//        demoStatic.methodStatic();
////        a = 5;
//
//        TestDemoStatic testDemoStatic = new TestDemoStatic();
//        testDemoStatic.phuongThucBinhThuong();
//        System.out.println("sau khi goi ham ---> "+TestDemoStatic.a);
    }
    public void phuongThucBinhThuong(){
        a = 6;
    }
}
