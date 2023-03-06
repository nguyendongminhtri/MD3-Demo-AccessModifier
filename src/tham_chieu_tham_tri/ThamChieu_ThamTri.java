package tham_chieu_tham_tri;

import java.util.Arrays;

public class ThamChieu_ThamTri {
    public static void main(String[] args) {
        int x = 10; // x có vùng nhớ ----> xyz1 --> STACK
//        changeValue(x);
        System.out.println("x có kiểu nguyên thủy sau khi gọi hàm ----> "+x);



        int[] arrInt = {10, 1};  //OBJECT --> Chia thành 2 vùng nhớ để lưu
        //1 vùng vùng nhớ lưu trong Stack vd: arrInt vẫn lưu ở Stack
        //1 vùng nhớ lưu các biến tham chiếu: vd: arrInt[0] , arrInt[1] lưu ở HEAP
        changeObject(arrInt);
        System.out.println("ArrInt sau khi gọi hàm");
        System.out.println(Arrays.toString(arrInt));

        Student student = new Student(4);
        System.out.println("student trước khi thay đổi --->"+student.getNumber());
        changeObject(student);
        System.out.println("Student sau khi gọi hàm --> "+student.getNumber());
    }
    public  void changeValue(int x){ //x' có vùng nhớ khác --> xyz2
        x = 5;
//      System.out.println("x trong method ---> "+x);
    }
    public static void changeObject(int[] arrInt){
        arrInt[0] = 100;
    }
    public static void changeObject(Student student){
        student.setNumber(5);
    }
}
