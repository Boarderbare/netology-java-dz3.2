public class BmiService {
    public float calculate (int weight, float height) {
        float bmi= weight/(height*height);
        return bmi;
    }
}
