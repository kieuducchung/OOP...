package oop.exercise10;

import java.util.Date;
import java.util.Scanner;

public class MeetingRoom extends Room {

    private int capacity;

    public MeetingRoom() {
    }

    public MeetingRoom(int capacity, String id, String name, double baseCost, Date checkinDate, Date checkoutDate) {
        super(id, name, baseCost, checkinDate, checkoutDate);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public double calculateCost() {
        double cost = getBaseCost() * calculateDayStays();
        if (capacity > 50) {
            cost *= 1.2; // Increase cost by 20% 
        }
        return cost;
    }

    @Override
    public void enterRoomInfo() {
        Scanner scanner = new Scanner(System.in);
        super.enterRoomInfo();
        System.out.println("Enter capacity: ");
        this.capacity = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public void updateRoomById(String id) {
        Scanner scanner = new Scanner(System.in);
        super.updateRoomById(id);
        System.out.println("Enter new capacity: ");
        this.capacity = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Capacity: " + capacity);
    }

}
