public class Main {
    public static void main(String[] args) {
        City city = new City("Minatitlan");

        // Crear una instancia de Land
        Land landVehicle = new Land(120, 2020, "Toyota", "SUV", city);
        System.out.println("Descripcion del vehiculo terrestre: " + landVehicle.description());
        System.out.println("Movimiento del vehiculo terrestre: " + landVehicle.moveWheels());

        // Crear una instancia de Amphibian
        Amphibian amphibianVehicle = new Amphibian(200, 2022, "AmphiX", "Hybrid");
        System.out.println("Descripcion del vehiculo anfibio: " + amphibianVehicle.description());
        System.out.println("Programacion de ruta del vehiculo anfibio: " + amphibianVehicle.pathPrograming());
        System.out.println("Propulsion del vehiculo anfibio: " + amphibianVehicle.moveJetPropulsion());



    }
}
