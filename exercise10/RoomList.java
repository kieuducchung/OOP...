package oop.exercise10;

import java.util.ArrayList;

public class RoomList {

    private ArrayList<Room> roomList;

    public RoomList() {
        this.roomList = new ArrayList<>();
    }

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public Room findRoomById(String id) {
        for (Room room : roomList) {
            if (room.getId().equals(id)) {
                return room;
            }
        }
        return null;
    }

    public void updateRoom(String id) {
        Room room = findRoomById(id);
        if (room != null) {
            room.updateRoomById(id);
        } else {
            System.out.println("Room with ID " + id + " not found!");
        }
    }

    public boolean deleteRoomById(String id) {
        Room room = findRoomById(id);
        if (room != null) {
            roomList.remove(room);
            System.out.println("Room with ID " + id + " has been successfully deleted.");
            return true;
        } else {
            System.out.println("Room with ID " + id + " not found.");
            return false;
        }
    }

    public void displayAllRooms() {
        if (roomList.isEmpty()) {
            System.out.println("The room list is currently empty.");
            return;
        }
        System.out.println("Room List:");
        for (Room room : roomList) {
            room.displayDetails();
            System.out.println("---------------------------");
        }
    }

    public Room findMostExpensiveRoom() {
        Room mostExpensiveRoom = null;
        double maxCost = 0;
        for (Room room : roomList) {
            double cost = room.calculateCost();
            if (cost > maxCost) {
                maxCost = cost;
                mostExpensiveRoom = room;
            }
        }
        return mostExpensiveRoom;
    }

    public void countRooms() {
        int meetingRooms = 0;
        int bedrooms = 0;
        for (Room room : roomList) {
            if (room instanceof MeetingRoom) {
                meetingRooms++;
            } else if (room instanceof BedRoom) {
                bedrooms++;
            }
        }
        System.out.println("Meeting Rooms: " + meetingRooms);
        System.out.println("Bed Rooms: " + bedrooms);
    }

}
