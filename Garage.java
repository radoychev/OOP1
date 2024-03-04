package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Garage {
    private int maxCapacityGarage;
    private String nameGarage;

    private String addressGarage;

    private int whiteCarsNum;

    private Car car;

    private ArrayList<Car> enteredCars = new ArrayList<>();

    private int maxWhiteCarsNum = 40;

    public Garage(int maxCapacityGarage, String nameGarage, String addressGarage)
    {
        this.maxCapacityGarage = maxCapacityGarage;
        this.nameGarage = nameGarage;
        this.addressGarage = addressGarage;
        this.whiteCarsNum = 0;
    }
    public int getMaxCapacity()
    {
        return this.maxCapacityGarage;
    }
    public void setMaxCapacityGarage(int maxCapacityGarage)
    {
        this.maxCapacityGarage = maxCapacityGarage;
    }

    public String getNameGarage()
    {
        return this.nameGarage;
    }
    public void setNameGarage(String nameGarage)
    {
        this.nameGarage = nameGarage;
    }

    public String getAddressGarage()
    {
        return this.addressGarage;
    }

    public void setAddressGarage(String addressGarage)
    {
        this.addressGarage = addressGarage;
    }

    public boolean enterCar(Car car)
    {
        if (!isGarageFull()) {

                if (car.getColorCar().equals("white")) {
                   if (this.whiteCarsNum >= maxWhiteCarsNum)
                   {
                       return false;
                   }
                   else
                   {
                       this.whiteCarsNum += 1;
                       this.enteredCars.add(car);
                       return true;
                   }
                }
                else
                {
                    this.enteredCars.add(car);
                    return true;
                }
        }
        return false;


    }

    public boolean checkLicense(Car car)
    {
        if(car.getLicensePlate().length() == 6)
        {
            return true;
        }
        return false;
    }
    public boolean isGarageFull()
    {
        //int currentCars = this.enteredCars.size();
        if (this.enteredCars.size() >= this.maxCapacityGarage)
        {
            return true;
        }

        return false;
    }

    public int getCarsNumByBrand(String carBrandSearched)
    {
        int carNum = 0;
        Iterator<Car> c = enteredCars.iterator();
        while (c.hasNext())
        {
            Car currentCar = c.next();
            if (currentCar.getBrandCar().equals(carBrandSearched))
            {
                carNum += 1;
            }

        }
        return carNum;
    }

    public void leaveCar(Car car)
    {
        if (checkLicense(car) == true)
        {
            this.enteredCars.remove(car);
        }
    }
}
