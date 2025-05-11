public class Calculator {
    
    public int add(int a, int b){
        return a + b;
    }

    public int subtract (int a, int b){
        return a - b;
    }

    public int product (int a, int b){
        return a * b;
    }

    public double quotient (int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        
        Calculator calc = new Calculator();

        int a = 50;
        int b = 10;
        int c =calc.add(a, b);
        int d =calc.subtract(a, b);
        int e =calc.product(a, b);
        double f =calc.quotient(a, b);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }



}
