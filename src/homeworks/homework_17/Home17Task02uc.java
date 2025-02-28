package homework_17;
/*
Task 2
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]

Перегрузить метод, если в него приходит массив + индекс, то часть массива слева до этого индекса
распечатывается в обычном порядке, а начиная с этого индекса в обратном:

{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
 */
public class Home17Task02uc {
    public static void main(String[] args) {

        int[] test = {1, 4, 3, 6, 7};
        printReverseArray(test);
    }
    public static void printReverseArray(int[] arr){
        printReverseArray(arr, 2);
    }

    public static void printReverseArray(int[] arr, int index){
        if(arr == null || index < 0 || index >= arr.length){
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i =0; i < index; i++){
            System.out.print(arr[i] + ", ");
        }

        for (int i = arr.length -1; i >= index; i--) {
            System.out.print(arr[i] + (i != index ? ", " : "]\n"));

        }
    }
}
