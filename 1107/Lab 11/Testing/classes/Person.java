public class Person implements IPerson {
    String name;
    int age;
    String CNP;
    String address;
    double salary;

    public Person(String name, int age, String CNP, String address, double salary) {
        this.name = name;
        this.age = age;
        this.CNP = CNP;
        this.address = address;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidPersonAgeException {
        if (age < 0)
            throw new InvalidPersonAgeException();
        this.age = age;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int calculateCreditScore() {
        double score = ((age / 15.0) * salary) / 150;
        return (int) score;
    }
}
