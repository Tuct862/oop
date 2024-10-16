/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplon;

import java.util.ArrayList;


public class Toa {
    private String buildingID;
    private String name;
    private String address;
    private final ArrayList<Phong> rooms;

    public Toa(String buildingID, String name, String address) {
        this.buildingID = buildingID;
        this.name = name;
        this.address = address;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Phong room) {
        rooms.add(room);
    }

    public ArrayList<Phong> getRoomList() {
        return rooms;
    }

    // Getters and Setters
    public String getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(String buildingID) {
        this.buildingID = buildingID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Building{" +
                "buildingID='" + buildingID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", rooms=" + rooms.size() +
                '}';
    }
}