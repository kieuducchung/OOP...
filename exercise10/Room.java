package oop.exercise10;

import java.util.Date;
import java.util.Scanner;

public abstract class Room implements IRoom {

    private String id;
    private String name;
    private double baseCost;
    private Date checkinDate;
    private Date checkoutDate;

    public Room() {
    }

    public Room(String id, String name, double baseCost, Date checkinDate, Date checkoutDate) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public long calculateDayStays() {
        long diff = checkoutDate.getTime() - checkinDate.getTime();
        return diff / (1000 * 60 * 60 * 24);
    }

    @Override
    public abstract double calculateCost();

    @Override
    public void enterRoomInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Room Id: ");
        this.id = scanner.nextLine();
        System.out.println("Enter Room name: ");
        this.name = scanner.nextLine();
        System.out.println("Enter Base Cost: ");
        this.baseCost = scanner.nextDouble();
        System.out.println("Enter Check-in Date (dd/MM/yyyy): ");
        String checkinDateStr = scanner.next();
        this.checkinDate = new Date(checkinDateStr);
        System.out.println("Enter Check-out Date (dd/MM/yyyy): ");
        String checkoutDateStr = scanner.next();
        this.checkoutDate = new Date(checkoutDateStr);
        scanner.nextLine();
    }

    @Override
    public void updateRoomById(String id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Updating room with id: " + id);
        System.out.println("Enter new name: ");
        this.name = scanner.nextLine();
        System.out.println("Enter new Base Cost: ");
        this.baseCost = scanner.nextDouble();
        System.out.println("Enter new Check-in Date (dd/MM/yyyy): ");
        String checkinDateStr = scanner.next();
        this.checkinDate = new Date(checkinDateStr);
        System.out.println("Enter new Check-out Date (dd/MM/yyyy): ");
        String checkoutDateStr = scanner.next();
        this.checkoutDate = new Date(checkoutDateStr);
        scanner.nextLine();
    }

    @Override
    public void displayDetails() {
        System.out.println("Room ID: " + id);
        System.out.println("Room name: " + name);
        System.out.println("Base Cost: " + baseCost);
        System.out.println("Check-in Date: " + checkinDate);
        System.out.println("Check-out Date: " + checkoutDate);
    }
}
