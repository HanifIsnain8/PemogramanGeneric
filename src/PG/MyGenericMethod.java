/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PG;

/**
 *
 * @author hanif
 */
public class MyGenericMethod {

    static <E> void showData(E[] data) {
        for (E e : data) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Object[] objects = {1, 2, 3, "Empat", 5};
        
        Integer[] numbers = {1, 2, 3, 4, 5};
        showData(numbers);
        showData(objects);
//        MyGenericMethod.showData(objects);

    }
}
