import java.util.Arrays;

/*Enough is enough!
        Alice and Bob were on a holiday. Both of them took many pictures of the places they've been,
        and now they want to show Charlie their entire collection. However, Charlie doesn't like these sessions,
        since the motive usually repeats. He isn't fond of seeing the Eiffel tower 40 times. He tells them that he will
        only sit during the session if they show the same motive at most N times. Luckily, Alice and Bob are able to encode
        the motive as a number. Can you help them to remove numbers such that their list contains each number only up to N times,
        without changing the order?

        Task
        Given a list lst and a number N, create a new list that contains each number of lst at most N times without reordering.
        For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2] since this would lead
        to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].

        Example
        EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
        EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]
 */
public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
//        if (elements == null) {
//            return null;
//        }
        int[] temp = new int[0];//null;

        for (int i = 0; i < elements.length; i++) {
            if (countElement(temp, elements[i]) < maxOccurrences) {
                temp = addElement(temp, elements[i]);
            }
        }
        return temp;
    }

    public static int countElement(int[] arr, int elem) {
//        if (arr == null) {
//            return 0;
//        }
        int counter = 0;
        for (int i = 0; i < arr.length; i++) counter += (arr[i] == elem) ? 1 : 0;

        return counter;
    }

    public static int[] addElement(int[] arr, int elem) {
//        if (arr == null) {
//            arr = new int[0];
//        }
        int[] newArr = new int[arr.length + 1];

        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[arr.length] = elem;
        } else {
            newArr[0] = elem;
        }

        return newArr;
    }

}
