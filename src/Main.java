import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

//        ����� ��� ������������ ������ ����� �����.
        ArrayList<Integer> smt = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 4, 2, 5, 6, 1));
//        1) ����� ������� �� ���� ������ ����� (void removeEven(ArrayList<Integer> list))
        System.out.println(smt);
        removeEven(smt);
        System.out.println(smt);
//        2) ����� ����������� �������� (Integer findMin(ArrayList<Integer> list))
        ArrayList<Integer> smt2 = new ArrayList<>(Arrays.asList(4, 33, 45, 25, 23, 19, 29,2));
        System.out.println(findMin(smt2));
//        3) ����� ������������ ��������
        System.out.println(findMax(smt2));
//        4) ����� ������� ��������
        System.out.println(findMidleInt(smt2));
//        �� ����, ����� ����������� 4 ������, ������ �� ������� ��������� ������ ����� �����, � ������ ���� ������.
    }

    //1) ����� ������� �� ���� ������ ����� (void removeEven(ArrayList<Integer> list))
    public static void removeEven(ArrayList<Integer> array) {
        Iterator<Integer> iterator = array.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }
    }

    //    2) ����� ����������� �������� (Integer findMin(ArrayList<Integer> list))
    public static Integer findMin(ArrayList<Integer> array) {
        int min = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < min) {
                min = array.get(i);
            }
        }
        return min;
    }

    public static Integer findMax(ArrayList<Integer> array) {
        int max = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) > max) {
                max = array.get(i);
            }
        }
        return max;
    }

    public static Integer findMidleInt(ArrayList<Integer> array) {
        int min = findMin(array);
        int max = findMax(array);
        int mid = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > min && array.get(i) <= (min + max) / 2 && array.get(i) > mid ||
                    array.get(i) < max && array.get(i) >= (min + max) / 2 && array.get(i) < mid) {
                mid = array.get(i);
            }
        }
        return mid;
    }
}