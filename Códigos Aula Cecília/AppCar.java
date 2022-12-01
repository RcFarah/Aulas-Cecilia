// Projeto1 - App
//import Car

public class App {
    public static void main(String[] args) throws Exception {
 
        Car car1 = new Car();
        car1.model = "Cerato";
        car1.brand = "Kia";
        car1.year = "2020";
        car1.price = "102.990,00";


        Car car1 = new Car();
        car1.model = "Cerato";
        car1.brand = "Kia";
        car1.year = "2020";
        car1.price = "87.850,00";

        Car car1 = new Car();
        car1.model = "Soul";
        car1.brand = "Kia";
        car1.year = "2020";
        car1.price = "79.990,00";

        Car car1 = new Car();
        car1.model = "Soul";
        car1.brand = "Kia";
        car1.year = "2020";
        car1.price = "50.000";

        Car car1 = new Car();
        car1.model = "Voyage";
        car1.brand = "Volkswagen";
        car1.year = "2020";
        car1.price = "59.750";

        if (System.getProperty("os.name").contains("Windows"))
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
        Runtime.getRuntime().exec("clear");




        System.out.println("Carros disponíveis para locação:\n");
	car1.ShowCar()
	car1.Km0()
	System.out.println('\n')

	car2.ShowCar()
	car2.SemiNew()
	System.out.println('\n')

	car3.ShowCar()
	car3.Km0()
	System.out.println('\n')

	car4.ShowCar()
	car4.Used()
	System.out.println('\n')

	car5.ShowCar()
	car5.Km0()
        }
}
