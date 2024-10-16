/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplon;
public class SinhVien{
    private String studentID;
    private String fullName;
    private String email;
    private String sdt;
    private Phong room; // Tham chiếu đến phòng ở
    private String status; // Trạng thái (đã đăng ký, đang ở, đã rời khỏi)

    public SinhVien(String studentID, String fullName, String email, String sdt) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.email = email;
        this.sdt = sdt;
        this.status = "Chưa đăng ký"; // Trạng thái mặc định
    }

    // Phương thức đăng ký phòng
    public void registerRoom(Phong room) {
        if (room.checkAvailability()) {
            this.room = room;
            this.status = "Đang ở";
            room.addStudent(this);
            System.out.println("Student " + fullName + " has registered to room " + room.getRoomID());
        } else {
            System.out.println("Room is full.");
        }
    }

    // Phương thức cập nhật thông tin cá nhân
    public void updateInfo(String newEmail, String newPhoneNumber) {
        this.email = newEmail;
        this.sdt = newPhoneNumber;
        System.out.println("Information updated for student " + fullName);
    }

    // Getters and Setters
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSDT() {
        return sdt;
    }

    public void setSDT(String phoneNumber) {
        this.sdt = sdt;
    }

    public Phong getRoom() {
        return room;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + sdt + '\'' +
                ", room=" + (room != null ? room.getRoomID() : "No Room") +
                ", status='" + status + '\'' +
                '}';
    }
}
