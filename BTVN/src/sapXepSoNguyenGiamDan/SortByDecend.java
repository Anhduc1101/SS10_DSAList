package sapXepSoNguyenGiamDan;

public class SortByDecend implements Comparable {
    private int a;

    public SortByDecend() {
    }

    public SortByDecend(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "IntegerArray{" +
                "a=" + a +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        return (int) o-this.a;
    }
}
