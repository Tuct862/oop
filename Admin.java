/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplon;

import java.util.ArrayList;

public class Admin {
    private String adminID;
    private String name;
    private String password;
    private String permissions;
    private KyTucXa ktx;  // Admin có thể quản lý một ký túc xá

    public Admin(String adminID, String username, String password, String permissions, KyTucXa ktx) {
        this.adminID = adminID;
        this.name = username;
        this.password = password;
        this.permissions = permissions;
        this.ktx = ktx;
    }

    // Phương thức quản lý sinh viên: In danh sách sinh viên trong từng phòng
    public void QuanLySinhVien() {
        System.out.println("Quan ly sinh vien: ");
        for (Toa building : ktx.getBuildingList()) {
            System.out.println("Building: " + building.getName());
            for (Phong room : building.getRoomList()) {
                System.out.println("Room: " + room.getRoomID());
                for (SinhVien student : room.getCurrentOccupants()) {
                    System.out.println("  Student: " + student.getFullName() + " - ID: " + student.getStudentID());
                }
            }
        }
    }

    // Phương thức quản lý phòng: In trạng thái phòng (trống hay đầy)
    public void QuanLyPhongO() {
        System.out.println("Quan ly phong o: ");
        for (Toa building : ktx.getBuildingList()) {
            System.out.println("Building: " + building.getName());
            for (Phong room : building.getRoomList()) {
                System.out.println("Room: " + room.getRoomID() + " - Type: " + room.getRoomType() +
                        " - Occupants: " + room.getCurrentOccupants().size() + "/" + room.getCapacity());
            }
        }
    }

    // Phương thức quản lý tòa nhà: In danh sách tòa nhà trong ký túc xá
    public void QuanLyToaNha() {
        System.out.println("Quan ly toa nha");
        for (Toa building : ktx.getBuildingList()) {
            System.out.println("Building ID: " + building.getBuildingID() + ", Name: " + building.getName() +
                    ", Address: " + building.getAddress());
        }
    }

    // Getters and Setters
    public String getAdminID() {
        return adminID;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPermissions() {
        return permissions;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminID='" + adminID + '\'' +
                ", username='" + name + '\'' +
                ", permissions='" + permissions + '\'' +
                '}';
    }   
}
