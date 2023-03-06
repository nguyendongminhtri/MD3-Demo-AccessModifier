package nested_class;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestNestedClass {
    public static void main(String[] args) {
        OuterClass.StaticClass staticClass = new OuterClass.StaticClass();
        System.out.println("staticClass --->"+staticClass.staticClass);

        //Inner Class
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        System.out.println("innerClass ---> "+innerClass.innerClass);

        Customer customer = new Customer();
        customer.validateAddress("Hà Nội");
    }

}
