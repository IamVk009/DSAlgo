package main.arrays.arrayQuestions.arrayADT;

public class ArrayOperations {

    public static void main(String[] args) {
        ArrayADTImpl arrayADT = new ArrayADTImpl(5 );
        arrayADT.insert(100);
        arrayADT.insert(300);
        arrayADT.insert(30);
        arrayADT.insert(10);
        arrayADT.insert(67);
        arrayADT.traverse();
        System.out.println(arrayADT.currentSize());
        System.out.println(arrayADT.getData(2));
        arrayADT.update(1, 23);
        arrayADT.traverse();
        arrayADT.delete(2);
        arrayADT.traverse();
        System.out.println(arrayADT.search(10));

    }
}
