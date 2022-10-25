package web.model;

public class Car {
    private String model;
    private int SerialNumber;
    private int YearOfIssue;

    public Car(String model, int serialNumber, int yearOfIssue) {
        this.model = model;
        this.SerialNumber = serialNumber;
        this.YearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.SerialNumber = serialNumber;
    }

    public int getYearOfIssue() {
        return YearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.YearOfIssue = yearOfIssue;
    }
}
