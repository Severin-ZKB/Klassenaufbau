package exercise2;

public class Patient {

    private String name;
    private int age;
    private double weight;
    private String gender;
    private boolean married;


    public Patient(String name, int age, double weight, String gender, boolean married) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.married = married;

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

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    @Override
    public String toString() {
        return name + " age: " + age + " weight: " + weight + " gender: " + gender + " married: " + married;
    }
}
