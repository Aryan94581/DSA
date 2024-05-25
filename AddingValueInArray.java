public class AddingValueInArray {
    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(5);
        sda.insertIntoArray(0, 10);
        sda.insertIntoArray(1, 20);
        sda.insertIntoArray(2, 30);
        sda.insertIntoArray(2, 30);
        sda.isEmptyOrNot(0);
        sda.isEmptyOrNot(1);
        sda.isEmptyOrNot(2);
        sda.isEmptyOrNot(3);
        sda.show();
    }
}
