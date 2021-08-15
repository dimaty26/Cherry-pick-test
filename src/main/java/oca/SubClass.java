package oca;

public class SubClass extends SuperClass {
    int i, j, k;

    public SubClass(int m, int n) {
        i = m;
        j = m;
    } //1

    public SubClass(int m) {
        super(m);
    } //2

    void method() {
        switch (1) {
            default:
                break;
        }
    }
}
