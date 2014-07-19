
public class Main {
    public static void main(String[] args) {

        Integer[] mas = {5,17,2,7};

        int rez=0;

        Calculator calc = new Calculator();
        rez=calc.max(mas);

        System.out.println(rez);
        System.out.println("Просто!");

    }


}
