package oop.exercise10;

import java.util.Date;
import java.util.Scanner;

public class BedRoom extends Room {

    private int numberOfBeds;

    public BedRoom() {
    }

    public BedRoom(int numberOfBeds, String id, String name, double baseCost, Date checkinDate, Date checkoutDate) {
        super(id, name, baseCost, checkinDate, checkoutDate);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public double calculateCost() {
        double cost = getBaseCost() * calculateDayStays();
        if (numberOfBeds >= 3) {
            cost *= 1.1; 
        }
        return cost;
    }

    @Override
    public void enterRoomInfo() {
        Scanner scanner = new Scanner(System.in);
        super.enterRoomInfo();
        System.out.println("Enter number of Beds: ");
        this.numberOfBeds = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public void updateRoomById(String id) {
        Scanner scanner = new Scanner(System.in);
        super.updateRoomById(id);
        System.out.println("Enter new number of Beds: ");
        this.numberOfBeds = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Beds: " + numberOfBeds);
    }
}
