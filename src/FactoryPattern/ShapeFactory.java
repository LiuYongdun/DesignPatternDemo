package FactoryPattern;

public class ShapeFactory {

    /**
     * 使用枚举和反射的方法获取对象
     * @param shapeEnum shape的枚举值
     * @return 相应的shape实例
     */
    public static Shape createShape(ShapeEnum shapeEnum){
        Class clazz = shapeEnum.getClazz();
        Shape shape=null;
        try {
            shape = (Shape)clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return shape;
    }
}
