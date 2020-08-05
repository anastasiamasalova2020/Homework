package Lesson9.by.annotations.masalova;

import java.lang.annotation.*;

//Придумать и написать собственную аннотацию @Version, которая бует хранить информацию о версии класса сервиса
// (поле обязательное) MyService и кодовое название версии (поле не обязательное)
// - (например номер версии = 7.1, а кодовое название версии = Nougat).
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Version {

    double version();//обязательная

    String code() default "null";//не обязательная

}
