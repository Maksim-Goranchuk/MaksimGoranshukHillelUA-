package less5.services;

public class Motion implements IMotion{


    public boolean jump(double height, double maxheight) {
        if (height<maxheight) return true;
        return false;
    }

    public boolean run(int distance, int maxdistance) {
        if (distance<maxdistance) return true;
        return false;
    }
}
