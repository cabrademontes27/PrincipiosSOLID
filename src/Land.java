public class Land extends Vehicle implements ILandEngine{
    private String type;
    private City city;

    public Land(int power, int year, String brand, String type, City city){
        super(power, year, brand);
        this.type = type;
        this.city = city;
    }
    
    @Override
    public String description() {
        return "Vehiculo terrestre: " + brand + ", ano " + year + ", poder " + power + " tipo " + type + ", localizado en " + city.getCiudad();
    }

    @Override
    public String moveWheels(){
        return "Configurando camino para el viaje por tierra  ";
    }
    
}
