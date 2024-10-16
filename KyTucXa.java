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
public class KyTucXa {
    private String ID; // Mã ký túc xá
    private String name; // Tên ký túc xá
    private final ArrayList<Toa> buildings; // Danh sách các tòa nhà thuộc ký túc xá

    public KyTucXa(String ID, String name) {
        this.ID = ID;
        this.name = name;
        this.buildings = new ArrayList<>();
    }

    // Phương thức thêm tòa nhà vào ký túc xá
    public void addBuilding(Toa toa) {
        buildings.add(toa);
    }

    // Phương thức lấy danh sách các tòa nhà thuộc ký túc xá
    public ArrayList<Toa> getBuildingList() {
        return buildings;
    }

    // Getters and Setters
    public String getDormID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dormitory{" +
                "dormID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", buildings=" + buildings.size() +
                '}';
    }
}

