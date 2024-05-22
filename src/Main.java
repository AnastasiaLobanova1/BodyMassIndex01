public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 67.2;
        double height = 1.65;
        double bmi = service.calculate(weight, height);
        System.out.printf("ИМТ = " + weight + " (кг) / " + height + "^2 " + "(м^2) = " + "%.2f",bmi);
    }
}