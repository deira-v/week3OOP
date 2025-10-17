package ie.atu;

public class Calculator {
    int result = 1;

    public int add(int firstNum, int secondNum)
    {
        return firstNum + secondNum;
    }

    public int sub(int firstNum, int secondNum)
    {
        return firstNum - secondNum;
    }

    public int mul(int firstNum, int secondNum)
    {
        return firstNum * secondNum;
    }

    public float div(float firstNum, float secondNum)
    {
        return firstNum / secondNum;
    }

    public int pow(int firstNum, int secondNum)
    {
        for (int i = 0; i < secondNum; i++)
        {
            result *= firstNum;
        }
         return result;
    }

    public int remain(int firstNum, int secondNum)
    {
        return firstNum % secondNum;
    }

}
