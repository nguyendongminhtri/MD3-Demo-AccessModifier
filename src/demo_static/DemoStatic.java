package demo_static;

public class DemoStatic extends Demo_Cha_Static {
    public static int number;
    public String name;

    static {
        number = 10;
    }
    public DemoStatic(String address) {
        super(address);
    }

    public void methodStatic(){
        System.out.println("Tao là phương thức static");
//        this.getName();
        super.getAddress();
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        DemoStatic.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
