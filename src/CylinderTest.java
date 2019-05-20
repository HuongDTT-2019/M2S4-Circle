public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(2.3,"yellow",4);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
    }
}
