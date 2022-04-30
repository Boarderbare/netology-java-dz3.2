public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight =71;
        float height =1.72F;
        float BodyMassIndex =service.calculate(weight,height);
        System.out.printf("Ваш индекс массы тела равен " + "%.2f",BodyMassIndex);
    }
}
