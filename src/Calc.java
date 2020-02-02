public class Calc {

    double calc(double numb1, double numb2) {
        if (numb1 > numb2) {
            return numb1 + numb2;
        } else if (numb1 < numb2) {
            return numb1 * numb2;
        } else {
            // Co z tym? (numb1 == numb2)???
            return Math.pow(numb1, numb2);
        }

    }
}




