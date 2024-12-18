package oop.exercise10;

import java.util.Scanner;

public class Processcor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RoomList roomList = new RoomList();
        while (true) {
            System.out.println("Options:");
            System.out.println("1. Add a new meeting room");
            System.out.println("2. Add a new bedroom");
            System.out.println("3. Update Room by id");
            System.out.println("4. Delete Room by id");
            System.out.println("5. Find Room by id");
            System.out.println("6. Display all Rooms");
            System.out.println("7. Find the most expensive Room");
            System.out.println("8. Count the total number of meeting rooms and bedrooms separately");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    MeetingRoom meetingRoom = new MeetingRoom();
                    meetingRoom.enterRoomInfo();
                    roomList.addRoom(meetingRoom);
                    break;
                case 2:
                    BedRoom bedRoom = new BedRoom();
                    bedRoom.enterRoomInfo();
                    roomList.addRoom(bedRoom);
                    break;
                case 3:
                    System.out.print("Enter Room ID to update: ");
                    String updateId = scanner.nextLine();
                    roomList.updateRoom(updateId);
                    break;
                case 4:
                    System.out.print("Enter Room ID to delete: ");
                    String deleteId = scanner.nextLine();
                    roomList.deleteRoomById(deleteId);
                    break;
                case 5:
                    System.out.print("Enter Room ID to find: ");
                    String findId = scanner.nextLine();
                    Room room = roomList.findRoomById(findId);
                    if (room != null) {
                        room.displayDetails();
                    } else {
                        System.out.println("Room not found.");
                    }
                    break;
                case 6:
                    roomList.displayAllRooms();
                    break;
                case 7:
                    Room mostExpensiveRoom = roomList.findMostExpensiveRoom();
                    if (mostExpensiveRoom != null) {
                        mostExpensiveRoom.displayDetails();
                    } else {
                        System.out.println("No rooms found.");
                    }
                    break;
                case 8:
                    roomList.countRooms();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
