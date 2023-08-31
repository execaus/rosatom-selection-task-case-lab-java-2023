package tasks.impl.second;

public class NumbersContainer {
    public int a = 2;
    public int b = 4;

    public String getString() {
        return String.format("%s %s", this.a, this.b);
    }

    public void replaceValues() {
        this.a = this.a + this.b - (this.b = this.a);
    }
}
