package nxu.it;

public class Student {
    private String sno;
    private String name;
    private String gender;
    private int age = 18;

    public Student() {
    }

    public Student(String sno, String name, String gender, int age) {
        this.sno = sno;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getSno() {
        return sno;
    }

    public Student setSno(String sno) {
        this.sno = sno;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Student setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }
}
