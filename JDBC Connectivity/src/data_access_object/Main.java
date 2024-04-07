package data_access_object;

public class Main {

    public static void main(String[] args) {

        Student john = new Student(1, "John", "JDBC", "Singapore");
        StudentDao studentDao = new StudentDao();
//        studentDao.add(john);
//        studentDao.delete(2);
//        Student harry = new Student(3, "Harry Potter", "JDBC", "Singapore");
//        studentDao.update(harry);

        studentDao.findAll();



    }
}
