package nested_class;

public class Customer {
    public boolean validateAddress(String customerAddress){
        class Address{
            String address;
            Address(String address){
                this.address = address;
            }
            public boolean validate(){
                if(address.equals(" ")){
                    return true;
                } else {
                    return false;
                }
            }
        }
        Address address = new Address(customerAddress);
        return address.validate();
    }
}
