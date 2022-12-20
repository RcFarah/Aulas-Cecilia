//import Car

public class AppCar {
    public static void main(String[] args) throws Exception {
 
        Car car1 = new Car();
        car1.model = "Cerato";
        car1.brand = "Kia";
        car1.year = "2020";
        car1.price = "102.990,00";


        Car car2 = new Car();
        car2.model = "Cerato";
        car2.brand = "Kia";
        car2.year = "2020";
        car2.price = "87.850,00";

        Car car3 = new Car();
        car3.model = "Soul";
        car3.brand = "Kia";
        car3.year = "2020";
        car3.price = "79.990,00";

        Car car4 = new Car();
        car4.model = "Soul";
        car4.brand = "Kia";
        car4.year = "2020";
        car4.price = "50.000";

        Car car5 = new Car();
        car5.model = "Voyage";
        car5.brand = "Volkswagen";
        car5.year = "2020";
        car5.price = "59.750";

        if (System.getProperty("os.name").contains("Windows"))
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
        Runtime.getRuntime().exec("clear");




        System.out.println("Carros disponíveis para locação:\n");
	car1.showCar();
	car1.km0();
	System.out.println('\n');

	car2.showCar();
	car2.semiNew();
	System.out.println('\n');

	car3.showCar();
	car3.km0();
	System.out.println('\n');

	car4.showCar();
	car4.used();
	System.out.println('\n');

	car5.showCar();
	car5.km0();
        }
}
