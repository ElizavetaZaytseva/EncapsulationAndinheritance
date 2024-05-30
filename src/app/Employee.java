package app;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String numberMobPhone;
    private int age;

    public Employee(String fullName,
                    String position,
                    String email,
                    String numberMobPhone,
                    int age) {

        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.numberMobPhone = numberMobPhone;
        this.age = age;

    }

    public String getFullName() {
        return this.fullName;
    }

    public String getPosition() {
        return this.position;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNumberPhone() {
        return this.numberMobPhone;
    }

    public int getAge() {
        return this.age;
    }

    public void incrementAge() {
        this.age++;
    }

    public void setPosition() {
        this.position = position;
    }

    public void setEmail() {

        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Error!");
        }
    }

    public void setNumberMobPhone() {
        String formatNumber = numberMobPhone.replaceAll("[^0-9]", "");
        if (formatNumber.length() == 10) {
            this.numberMobPhone = "(" + formatNumber.substring(0, 3) + ") " +
                    formatNumber.substring(3, 6) + " " +
                    formatNumber.substring(6, 8) + " " +
                    formatNumber.substring(8);

//
//          this.numberMobPhone = numberMobPhone;
        } else {
            System.out.println("Error!");
        }
    }

    public void printOn() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee: " +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", numberPhone=" + numberMobPhone + '\''+
                 ", age=" + age;

        }


    }


