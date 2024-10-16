/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplon;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Phong {
    private String roomID;
    private int capacity;
    private ArrayList<SinhVien> currentOccupants;
    private Toa building; // Tham chiếu đến tòa nhà
    private String roomType; // Loại phòng (phòng thường, phòng VIP,...)

    public Phong(String roomID, int capacity, Toa building, String roomType) {
        this.roomID = roomID;
        this.capacity = capacity;
        this.building = building;
        this.roomType = roomType;
        this.currentOccupants = new ArrayList<>();
    }
//getter và setter
    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<SinhVien> getCurrentOccupants() {
        return currentOccupants;
    }

    public void setCurrentOccupants(ArrayList<SinhVien> currentOccupants) {
        this.currentOccupants = currentOccupants;
    }

    public Toa getBuilding() {
        return building;
    }

    public void setBuilding(Toa building) {
        this.building = building;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    // Phương thức kiểm tra phòng trống
    public boolean checkAvailability() {
        return currentOccupants.size() < capacity;
    }

    // Phương thức thêm sinh viên vào phòng
    public void addStudent(SinhVien student) {
        if (checkAvailability()) {
            currentOccupants.add(student);
            System.out.println("Student " + student.getFullName() + " added to room " + roomID);
        } else {
            System.out.println("Room is full. Cannot add student.");
        }
    }

    // Phương thức loại bỏ sinh viên khỏi phòng
    public void removeStudent(SinhVien student) {
        if (currentOccupants.remove(student)) {
            System.out.println("Student " + student.getFullName() + " removed from room " + roomID);
        } else {
            System.out.println("Student not found in the room.");
        }
    }@Override
    public String toString() {
        return "Room{" +
                "roomID='" + roomID + '\'' +
                ", capacity=" + capacity +
                ", currentOccupants=" + currentOccupants.size() +
                ", building=" + building.getName() +
                ", roomType='" + roomType + '\'' +
                '}';
    }
}
