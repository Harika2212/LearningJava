package July.ex_07072024.ex_28072024;

public class Lab155 {
    public static void main(String[] args) {

        //ClassName Classref = new ClassName();
        // ClassName - Name of the Class
        //Classref - Class Reference
        //new ClassName() - object

        BuildingBP dlf = new BuildingBP();

        dlf.Name ="Harika Nilayam";
        dlf.address ="Hyderabad";
        dlf.noOfRooms = "10";

        dlf.gardening();

        BuildingBP UC = new BuildingBP();

        UC.Name ="Mokshagna Ram Nilayam";
        UC.address ="Anantapur";
        UC.noOfRooms = "20";

        UC.gardening();
        UC.useLift();
    }

}
