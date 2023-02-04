public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 125;
        float height = (float) 1.95F;
        float bodyMassIndex = service.calculate(weight,height);
        System.out.println(bodyMassIndex);
    }
}