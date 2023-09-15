package org.example.parameter;

public class Gen<T, V> {

    T ob;
    V ob2;

    T[] mas;

    public Gen(T ob, V ob2) {
        this.ob = ob;
        this.ob2 = ob2;
    }

    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public V getOb2() {
        return ob2;
    }

    public void showType(){
        System.out.println("Типом Т является "+ob.getClass().getName());
        System.out.println("Типом V является "+ob2.getClass().getName());
    }
}
