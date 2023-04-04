public class Main {
    public static void main(String[] args) {
        SalesManager manager = new SalesManager(new long[]{50,60,1000});
        System.out.println("Проверяем работу класса SalesManager");
        System.out.println("Максимум продаж - " + manager.max());
    }
}
