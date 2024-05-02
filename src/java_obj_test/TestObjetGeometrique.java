package java_obj_test;

import java_obj_interfaces.Cercle;
import java_obj_interfaces.ObjetGeometrique;
import java_obj_interfaces.Rectangle;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] objs = new ObjetGeometrique[] {
                new Cercle(10.4),
                new Rectangle(12, 13.3)
        };

        for (int i = 0; i < objs.length; i++) {
            System.out.println(objs[i].surface());
            System.out.println(objs[i].perimetre());
        }
    }
}
