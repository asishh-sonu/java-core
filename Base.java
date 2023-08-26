class Base{
    int x;
}
class Sub extends Base{
    int y;
    public static Base createObject1(){

        Sub ss = new Sub();
        ss.x += 5;
        ss.y += 10;

        return ss;
    }
}