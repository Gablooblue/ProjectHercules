// @author Gab

public class BMREquation
{
    static double BMR;
    /*
    * @params height, weight, age, gender
    * @returns calculated BMR
    */
    public static float calculator(int height, float weight, int age, char gender)
    {
        if(gender == 'M')
        {
            BMR = (10 * weight + 6.25 * height - 5 * age + 5);
        }
        else if (gender == 'F')
        {
            BMR = (10 * weight + 6.25 * height  - 5 * age - 161);
        }
        return BMR;
    }
}