package web.models;

public class Car {
    private String carModel;
    private String carType;
    private int carYearManuf;

    public Car() {
    }

    public Car(String carModel, String carType, int carYearManuf) {
        this.carModel = carModel;
        this.carType = carType;
        this.carYearManuf = carYearManuf;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getCarYearManuf() {
        return carYearManuf;
    }

    public void setCarYearManuf(int carYearManuf) {
        this.carYearManuf = carYearManuf;
    }

    @Override
    public String toString() {
        return "Информация о машине: " +
                "модель = " + carModel +
                ", тип = " + carType +
                ", год выпуска = " + carYearManuf +
                '.';
    }
}
