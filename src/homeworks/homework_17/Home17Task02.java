package homework_17;
/*
Task 2
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]

Перегрузить метод, если в него приходит массив + индекс, то часть массива слева до этого индекса
распечатывается в обычном порядке, а начиная с этого индекса в обратном:

{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
 */
public class Home17Task02 {
    public static void main(String[] args) {

        int[] digit = {1, 4, 3, 6, 7};
        printArrayBackwards(digit);
        printArrayBackwards(1, digit);
    }

    public static void printArrayBackwards( int n, int[] array){
        System.out.print("[");
        for (int i = 0;i < array[n] - 2; i++) {
            System.out.print(array[i] + ", " );
            }
        for (int i = array[n] ; i > 1; i--) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\b\b" + "]");

        }


    public static void printArrayBackwards(int[] array){
        System.out.print("[");
        for (int i = 4;i >= array[0] - 1; i--) {
            System.out.print(array[i] + (i >= array[0] ? ", " : "]\n") );
        }
    }

}


