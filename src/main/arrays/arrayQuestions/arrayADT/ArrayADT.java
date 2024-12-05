package main.arrays.arrayQuestions.arrayADT;

public interface ArrayADT {
    void insert(int value);

    void delete(int deleteIndex);

    int search(int element);

    int getData(int elementIndex);

    void traverse();

    void update(int elementIndex, int element);

    int currentSize();
}
