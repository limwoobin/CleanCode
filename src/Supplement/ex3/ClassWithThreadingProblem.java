package Supplement.ex3;

public class ClassWithThreadingProblem {
    int nextId;
    int lastId;

    public int takeNextId() {
        return nextId++;
    }

    public int takeLastId() {
        return lastId;
    }
}
