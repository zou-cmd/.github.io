public class A1 {
    public static void main(String[] args) {

    }
}
class Stu{
    //注解可以显示赋值，如果没有赋值，那就必须给赋值
    @myAcconation1(name = "张三")
    public void show(){}

}
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface myAcconation1{
    //这是注解的形式，不是方法 参数类型+参数名()
    String name() default "";//默认为空串
    int age() default 0;
    int value() default -1;//如果只有一个注解，直接用value()就行。如果默认值为-1表示不存在
    String[] a() default {"1","2"};

}
