package Lesson9.by.annotations.masalova;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//Написать программу, которая будет анализировать присутствие аннотации над классом MyService
//и если она присутствует - создавать экземпляр этого класса, задавать значения его полям и
//вызывать метод thisClassInfo (использовать возможности пакета reflection).
public class ServiceRunner {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException {
       inspectService();
    }

    static void inspectService()throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException  {
        if (MyService.class.isAnnotationPresent(Version.class)) {
            Version version = MyService.class.getAnnotation(Version.class);
            MyService service = new MyService();
            service.setCode(version.code());//присваивание сервису значений полей из аннатации
            service.setVersion(version.version());//присваивание сервису значений полей из аннатации

            Method method= MyService.class.getDeclaredMethod("thisClassInfo");
            method.setAccessible(true);
            System.out.println("Объект класса MyService:");
            method.invoke(service, (Object[]) null);
        }
        else {
            System.out.println("Аннотации @Version над классом MyService нет.");
        }
    }
}
