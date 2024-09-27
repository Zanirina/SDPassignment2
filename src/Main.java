public class Main {
    public static void main(String[] args) {

        DatabaseConnection data = DatabaseConnection.getInstance();
        DatabaseConnection data2 = DatabaseConnection.getInstance();

        if(data.equals(data2)){
            System.out.println("Instances are equal");
        }
        else{
            System.out.println("Instances are not equal");
        }
    }
}