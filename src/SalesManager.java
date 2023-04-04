public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min(){
        long min = Long.MAX_VALUE;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long cutAverage(){
        long min = min();
        long max = max();
        long sum = 0;
        for (long sale: sales){
            if (sale != min && sale != max){
                sum += sale;
            }
        }
        return sum / (sales.length-2);
    }
}