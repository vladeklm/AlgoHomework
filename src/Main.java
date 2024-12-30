//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how GIGA IDE suggests fixing it.

        var arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i-1;
        };
        System.out.println(CustomArrays.binarySearch(arr, 0, arr.length, 2));
    }
}