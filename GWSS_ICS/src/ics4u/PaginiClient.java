package OOP;

/**
 *
 * @author User
 */
public class PaganiClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PaganiManufacturer MrPagani = new PaganiManufacturer();

        Car car1 = new Car();
        car1.setCarName("Huyara");
        car1.setPrice(1600000.00);
        car1.setColour("Red");
        car1.setStreetLeagle(true);
        car1.setTopSpeed(230);

        Car car2 = new Car();
        car2.setCarName("Zonda");
        car2.setPrice(-11);
        car2.setColour("White");
        car2.setStreetLeagle(true);
        car2.setEngineSize(12.0);
        car2.setTopSpeed(218);

        Car car3 = new Car();
        car3.setCarName("Cinque");
        car3.setColour("Green");
        car3.setTopSpeed(223);
        car3.setZeroToSixty(3.4);
        car3.setStreetLeagle(false);
        car3.setPrice(1800000.00);

        System.out.println(car1.toString());
        System.out.println(car1.equals(car3));

        car1.setCarManufacturer(MrPagani);
        car2.setCarManufacturer(MrPagani);

        MrPagani.addCars(car1);
        MrPagani.addCars(car2);
        MrPagani.addCars(car3);

        //Add tests
       //Remove Tests
        //Adding objects to the list but they must be valid
        MrPagani.addCars(car1);
        System.out.println(“Add test 1: valid object. Before length: ” + blah.getArrayListSize();
        System.out.println("");
    System.out.println(“Add test 1: valid object. Afterlength: ” + blah.getArrayListLength();

        //Adding Duplicates to the list
        MrPagani.addCars(car1);

        //Adding a invalid object to the car list (Set the price to an invalid Number
        MrPagani.addCars(car2);

        //Adding null objects
        MrPagani.addCars(null);


