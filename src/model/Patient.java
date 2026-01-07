package model;

public class Patient {
    private String nhsNumber;
    private String name;
    private String dateOfBirth;
    private String address;

    public Patient(String nhsNumber, String name, String dateOfBirth, String address) {
        this.nhsNumber = nhsNumber;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getNhsNumber() { return nhsNumber; }
    public String getName() { return name; }
    public String getDateOfBirth() { return dateOfBirth; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return nhsNumber + "," + name + "," + dateOfBirth + "," + address;
    }
}
