package oo;

public class StudentTestDrive {
    public static void main(String[] args) {
        Student sonStudent;
        sonStudent = new Student("Nguyen Truong Son", "123456", "K14DCMT01", "CNTT", "Mang may tinh");
        sonStudent.inThongTin();
        

        Student phongStudent;
        phongStudent = new Student("Nguyen Tri Tuan Phong", "123123", "K14DCMT01", "CNTT", "Mang may tinh");
        phongStudent.inThongTin();
        

        Student thuStudent;
        thuStudent = new Student("Nguyen Thi Vu Thu", "123234", "K14DCMT01", "CNTT", "Mang may tinh");
        thuStudent.inThongTin();
    }
}
