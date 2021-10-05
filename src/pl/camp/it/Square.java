package pl.camp.it;

public class Square {
    private int side;
    private int field;
    private int circuit;

    public Square(int side) {
        this.side = side;
        this.field = side * side;
        this.circuit = 4 * side;
    }

    public int getSide() {
        return side;
    }

    public int getField() {
        return field;
    }

    public int getCircuit() {
        return circuit;
    }

    void setSide(int side) {
        this.side = side;
        this.field = side * side;
        this.circuit = 4 * side;

        // teraz jeszcze coś trzeba zrobić
    }

    public void setField(int field) {
        this.field = field;
    }
}
