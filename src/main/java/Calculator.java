public class Calculator {
    public double add(double a,double b){
        return a+b;
    }
    public double sub(double a,double b){
        return a-b;
    }
    public double arithmetic(double a,double b,double c){
        Calculator2 cal = new Calculator2();
        double d = cal.multiply(a,b);
        return d+c;
    }
}
