package tmp;

public class HousingMain {
    public static void main(String[] args) {
        HouseTemplate houseType = new GlassHouse();
        houseType.buildHouse();

        System.out.println("========================");

        houseType = new WoodenHouse();
        houseType.buildHouse();
    }
}
