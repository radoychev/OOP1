package org.example;

public class Car {
    private String colorCar;
    private String brandCar;
    private String licensePlate;

    public Car(String colorCar, String brandCar, String licensePlate)
    {
        this.colorCar = colorCar;
        this.brandCar = brandCar;
        this.licensePlate = licensePlate;
    }
    public String getColorCar()
    {
        return this.colorCar;
    }
    public void setColorCar(String colorCar)
    {
        this.colorCar = colorCar;
    }

    public String getBrandCar()
    {
        return this.brandCar;
    }
    public void setBrandCar(String brandCar)
    {
        this.brandCar = brandCar;
    }

    public String getLicensePlate()
    {
        return this.licensePlate;
    }
    public void setLicensePlate(String licensePlate)
    {
        this.licensePlate = licensePlate;
    }
}

