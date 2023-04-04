public class Main {
    public static void main(String[] args) {
        SalesManager manager = new SalesManager(new int[]{50,60,1000,3000,0,40,50});
        System.out.println("Проверяем работу класса SalesManager");
        System.out.println("Максимум продаж - " + manager.max());
        System.out.println("Минимум продаж - " + manager.min());
        System.out.println("Ообрезанное среднее продаж - " + manager.cutAverage());
    }
}
