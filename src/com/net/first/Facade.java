package com.net.first;

import com.net.first.subSystem.SubSystemFour;
import com.net.first.subSystem.SubSystemOne;
import com.net.first.subSystem.SubSystemThree;
import com.net.first.subSystem.SubSystemTwo;

/**
 * Created by daidaijie on 2016/1/25.
 */
public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA(){
        System.out.println("\n方法组A()---");
        one.methodOne();
        two.methodTwo();
        four.methodFour();
    }

    public void methodB(){
        System.out.println("\n方法组B()---");
        two.methodTwo();
        three.methodThree();
    }


}
