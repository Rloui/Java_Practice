public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if((temperature > 25 && temperature <= 35) || (summer && temperature <= 45)){
            return true;
        }
        return false;
    }
}
