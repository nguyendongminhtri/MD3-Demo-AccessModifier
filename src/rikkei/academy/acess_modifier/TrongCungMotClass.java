package rikkei.academy.acess_modifier;

import rikkei.academy.ngoai_package.NgoaiPackage;

public class TrongCungMotClass  extends NgoaiPackage{
    //Có 3 từ khóa: private, protected, public ---> Tạo 4 phạm vi truy cập trong đó có default
    public int trongCungMotClass = 1;

    public static void main(String[] args) {
        TrongCungMotClass trongCungMotClass1 = new TrongCungMotClass();
        System.out.println(trongCungMotClass1.trongCungMotClass);
        //Trong cùng class thì bất kì từ khóa nào cũng truy xuất được

        //NGOAI CLASS NHUNG CUNG PACKAGE
        NgoaiClassNhungCungPackage ngoaiClassNhungCungPackage = new NgoaiClassNhungCungPackage();
        System.out.println("Ngoai Class ---> "+ngoaiClassNhungCungPackage.ngoaiClass);

        //NGOAI PACKAGE
        TrongCungMotClass trongCungMotClass2 = new TrongCungMotClass();
        System.out.println("Truy xuất từ thằng con thông qua protected ---> "+trongCungMotClass2.ngoaiPackage);

//        NgoaiPackage ngoaiPackage = new NgoaiPackage();
//        System.out.println("Truy xuất ngoài package thông qua public ---> "+ngoaiPackage.ngoaiPackage);
    }
}
