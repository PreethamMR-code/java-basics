public class Blade {

    Blade(){
        System.out.println("BLADE IS INVOKED");
    }

    Blade(String material, double length, double width, double thickness, String sharpness){
        System.out.println("Blade parameterized constructor is invoked");
        this.material = material;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.sharpness = sharpness;
    }

    String material;
    double length;
    double width;
    double thickness;
    String sharpness;

    public void getBladeInfo()
    {
        System.out.println("\nBlade Details:");
        System.out.println("Material: " + material);
        System.out.println("Length: " + length );
        System.out.println("Width: " + width );
        System.out.println("Thickness: " + thickness );
        System.out.println("Sharpness: " + sharpness);

    }

}