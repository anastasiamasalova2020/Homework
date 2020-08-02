package Lesson9.by.annotations.masalova;
import Lesson9.by.annotations.masalova.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//Написать программу, которая будет анализировать присутствие аннотации над классом MyService
//и если она присутствует - создавать экземпляр этого класса, задавать значения его полям и
//вызывать метод thisClassInfo (использовать возможности пакета reflection).
public class ServiceRunner {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
       inspectService(MyService.class);
    }

    static void inspectService(Class<MyService> serviceClass)throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException  {
        if (serviceClass.isAnnotationPresent(Version.class)) {
            Version version = serviceClass.getAnnotation(Version.class);
            MyService service = new MyService();
            service.setCode(version.code());
            service.setVersion(version.version());
            Method method=serviceClass.getDeclaredMethod("thisClassInfo");
            method.setAccessible(true);
            System.out.println("Объект класса MyService:");
            method.invoke(service, (Object[]) null);
        }
        else {
            System.out.println("Аннотации @Version над классом MyService нет.");
        }
    }
}
