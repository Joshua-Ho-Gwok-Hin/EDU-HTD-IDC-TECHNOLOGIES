package data_access_object;

public class Student {

    int rollNo;
    String name;
    String course;
    String address;

    public Student(int rollNo, String name, String course, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.address = address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
