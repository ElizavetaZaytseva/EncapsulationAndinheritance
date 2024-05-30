package app;

public class Main {
    public static void main(String[] arg) {
        Employee employee = new Employee(
                "Karpenko Mykola Mykolayvich",
                "Manager",
                "karpenkoqmail.com",
                "(067) 111 11 11",
                35);
        employee.printOn();


        employee.incrementAge();
        employee.setEmail();
        employee.setNumberMobPhone();
        }
}

