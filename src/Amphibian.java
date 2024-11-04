public class Amphibian extends Vehicle implements ILandEngine, IAmphibianEngine, IWatherVehicle{
    private String type;

    public Amphibian(int power, int year, String brand, String type){
        super(power, year, brand);
        this.type = type;
    }

    @Override
    public String description() {
        return "Vehiculo amfibio: " + brand + ", ano " + year + ", poder " + power + "hp, tipo " + type;
    }

    @Override
    public String pathPrograming() {
        return "Configurando camino para el viaje por agua";
    }

    @Override
    public String moveJetPropulsion() {
        return "Activacion de propulsor jet";
    }

    @Override
    public String moveWheels(){
        return"Moviendo  llantas ";
    }



    



}
