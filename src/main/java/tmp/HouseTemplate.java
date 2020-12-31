package tmp;

public abstract class HouseTemplate {
    
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }

    protected abstract void buildWalls();

    protected abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods and sand");
    }

    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }
}
