public class Teste3 {
    public static void main(String[] args) {
        Student s1 = new Student("João", "Rua A, 123", "ADS", 2025, 1200.50);
        System.out.println(s1);
        s1.setFee(1500.00);
        System.out.println("Taxa atualizada: " + s1.getFee());

        Staff st1 = new Staff("Maria", "Rua B, 456", "IFSP Cubatão", 3500.00);
        System.out.println(st1);
        st1.setPay(4000.00);
        System.out.println("Salário atualizado: " + st1.getPay());
    }
}

//MELISSA ESCARMELOTO GUEDES CB3030296
