
public class Calc {
    double numb1;
    double numb2;

    double Calc() {
        if (numb1 > numb2) {
            return numb1 + numb2;
        }
        if (numb1 < numb2) {
            return numb1 * numb2;
        }
        if (numb1 == numb2) {
            return Math.pow(numb1, numb2);
        }
        return Calc();
    }
}




