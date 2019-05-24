package made;

public class Junit {
    public static int result;
    public void add(int n) {
        result=result+n;
    }
    public void substract(int n) {
        result=result-n;
    }
    public void multiply(int n) {

    }
    public void divide(int n) {
        result=result/n;
    }
    public int getResult() {
        return result;
    }
    public void clear() {
        result=0;
    }
}
