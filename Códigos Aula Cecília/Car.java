// Classe car
//package classe;

public class Car {
    // Atributos da Classe Car
    public String model;
    public String brand;
    public String year;
    public String price;

    // Métodos da Classe Pessoa
    public void km0(){
        System.out.println("Rodagem: 0 km!\n");
    }

    public void semiNew(){
        System.out.print("Rodagem: 1 - 999Km!\n");
    }

    public void used(){
    System.out.print("Rodagem: >1000Km!\n");
    }

    public void showCar(){
        System.out.println("Carro: \n- " + model + "\n- " + brand + "\n- " + year + "\n- " + price);
    }
}
