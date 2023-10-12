package chapterr9;

import chapter9.Protection;

public class OtherPackage {
    OtherPackage(){
        chapter9.Protection p = new chapter9.Protection();
        System.out.println("кoнcтpyктop из другого пакета");
        // доступно только для данного класса или пакета
        // System.out.println("n = " + p.n);
        // доступно только для данного класса
        // доступно только для данного класса, подкласса или пакета
        // System.out.println("n_pri " + p.n_pri);
        //System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);

    }
}
