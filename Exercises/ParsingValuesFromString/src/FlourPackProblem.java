public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int sum = 0;
        int amountOfFullBigCount = goal / 5; //2

        if(bigCount > amountOfFullBigCount) {
            bigCount = amountOfFullBigCount;
        }

        if(bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            sum = smallCount + (bigCount * 5);
            if(sum >= goal) {
                return true;
            }
        }
        return false;
    }
}

/*
* 2 big bags and 9 goal
*
* 2 big bags = 10 and it can't be divided so we have to use 1
*
* if number of kilos from big bag do not go evenly into our goal return false
*
* if((bigCount * 5) % goal == 0)
* */