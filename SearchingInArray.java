public class SearchingInArray {
    int i;

    public void SearchElement(int Array[], int TargetValue) {
        for (i = 0; i < Array.length; i++) {
            if (Array[i] == TargetValue) {
                System.out.println("Your value present at index of :" + i);
                return;
            }
        }
        System.out.println("Your value does not Exist in this Array");
    }
}
