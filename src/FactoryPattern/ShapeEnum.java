package FactoryPattern;

public enum ShapeEnum {

    Circle(FactoryPattern.Circle.class,"circle"),
    Rectangle(FactoryPattern.Rectangle.class,"rectangle");

    private Class clazz;
    private String name;

    ShapeEnum(Class clazz,String name){
        this.clazz=clazz;
        this.name=name;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
