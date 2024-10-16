/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package baitaplon;

public class Main {
    public static void main(String[] args) {
         // Tạo các đối tượng Ký túc xá, Tòa nhà, Phòng và Sinh viên
        KyTucXa ktx = new KyTucXa("D01", "Ky tuc xa A");

        Toa building1 = new Toa("B01", "Taa nha 1", "123 Duong ABC");
        Phong room101 = new Phong("101", 4, building1, "Thuong");
        Phong room102 = new Phong("102", 2, building1, "VIP");

        building1.addRoom(room101);
        building1.addRoom(room102);

        ktx.addBuilding(building1);

        SinhVien student1 = new SinhVien("S01", "Nguyen Van A", "a@gmail.com", "0123456789");
        SinhVien student2 = new SinhVien("S02", "Tran Thi B", "b@gmail.com", "0987654321");

        room101.addStudent(student1);
        room101.addStudent(student2);

        // Tạo Admin với quyền quản lý Ký túc xá
        Admin admin = new Admin("A01", "admin1", "adminpass", "full", ktx);

        // Gọi các phương thức quản lý của Admin
        System.out.println("Quan ly sinh vien:");
        admin.QuanLySinhVien();

        System.out.println("\nQuan ly phong:");
        admin.QuanLyPhongO();

        System.out.println("\nQuan ly toa nha:");
        admin.QuanLyToaNha();
    }
}
   

