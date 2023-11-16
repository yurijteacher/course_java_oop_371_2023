package unit8;

public interface Calculation {

    double n = 5;

    double add(double a, double b);

    double sub(double a, double b);

    default double div(double a, double b){

//        if(b!=0){
//            double c = a/ b;
//            return c;
//        } else {
//            return 0;
//        }

//        double v = (b!=0) ? a/b : 0;
//
//        return v;

        return (b!=0) ? a/b : 0;
    };


    static double mul(double a, double b){
        return a * b;
    }



}
