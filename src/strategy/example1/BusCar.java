package strategy.example1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 14:17
 */
public class BusCar extends CarImpl {
    BusCar(String carName, String carColor) {
        super(carName, carColor);
    }

    public void run(){
        System.out.println(carColor+"的"+carName);
    }
}
