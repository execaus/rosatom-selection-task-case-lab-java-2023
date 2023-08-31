package tasks.impl.second;

/**
 * Хранилище для двух чисел.
 */
public class PairNumberContainer {
    public int a = 2;
    public int b = 4;

    public String getString() {
        return String.format("%s %s", this.a, this.b);
    }

    public void replaceValues() {
        this.a = this.a + this.b - (this.b = this.a);
    }
}
