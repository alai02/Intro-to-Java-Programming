package OOP;


import java.util.ArrayList;

/**
 *
 * @author Alex  Date October 2, 2014 
 * v1.00 
 * This program creates a object of the Pagani car company 
 */
public class PaganiManufacturer {

    public static final int roadster = 0;
    public static final int spyder = 1;
    public static final int coupe = 2;
    public static final int dragster = 3;

    private String carName;

    private ArrayList<Car> cars;
    public int carType;

    public PaganiManufacturer() {
        this.cars = new ArrayList<Car>();
    }

    public PaganiManufacturer(String carName) {
        this.carName = carName;

    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        if (carName != null) {
            this.carName = carName;
        } else {
            System.out.println("Invalid ID ");
        }
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "PaganiManufacturer{" + "The cars name: " + carName + ", The Cars: " + cars + '}';
    }

    public void addCars(Car cars) {
        this.cars.add(cars);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    public int getCarType() {
        switch (carType) {
            case 1:
                carType = roadster;
                break;
            case 2:
                carType = spyder;
                break;
            case 3:
                carType = coupe;
                break;
            case 4:
                carType = dragster;
                break;
            default :
                return -1;
        }
        return carType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PaganiManufacturer other = (PaganiManufacturer) obj;
        if ((this.carName == null) ? (other.carName != null) : !this.carName.equals(other.carName)) {
            return false;
        }
        return true;
    }
   
  

    public void addCar(Car carAdded) {
        boolean carAlreadyAdded = false;
        if (carAdded != null) {
            for (int i = 0; i < cars.size(); i++) {
                if (cars.get(i).getCarName() == carAdded.getCarName()) {
                    carAlreadyAdded = true;
                    System.out.println("Add Car: car has already been added to list");
                    i = cars.size();
                }
            }
            if (carAlreadyAdded != true) {
                if (!carAdded.isValid()) {
                    System.out.println("Car is not valid.");
                } else {
                    System.out.println("Add Car: " + carAdded.getCarName() + " has been added");
                    cars.add(carAdded);
                }
            }
        } else {
            System.out.println("Add Car: cannot add null objects");
        }
    }

    private void removeCarByIndex(int index) {
        if (index >= 0 && index < cars.size()) {
            System.out.println("Remove The Car By The Index: " + cars.get(index).getCarName() + " has been removed");
            cars.remove(index);
        } else {
            System.out.println("Remove The Car By The Index: index given is not valid");
        }
    }

     public void removeCar() {
        boolean exists = false;
        int objectIndex = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getCarName().equalsIgnoreCase(carName)) {
                exists = true;
                objectIndex = i;
                i = cars.size();
            }
        }
        if (exists) {
            removeCarByIndex(objectIndex);
        } else {
            System.out.println("could not get this car for you: " + cars);
        }
    }

    private PaganiManufacturer getCarByIndex(int i) {
        if (i >= 0 && i < cars.size()) {
            System.out.println("Get the car by the index: " + cars.get(i).getCarName() + " has been found");
            return cars.get(i);
        } else {
            System.out.println("Get Car by the index: car index " + i + " not valid.");
            return null;
        }

    }


    public PaganiManufacturer getCar(String carName, int cerealNumber) {
        int objectIndex = 0;
        boolean exists = false;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getCarName().equalsIgnoreCase(carName)) {
                objectIndex = i;
                exists = true;
                i = cars.size();
            }
        }
        if (exists) {
            return getCarByIndex(objectIndex);
        } else {
            System.out.println("could not get this car for you: " + cars);
            return null;
        }

    }
}

