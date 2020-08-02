package Lesson9.by.annotations.masalova;

/*
Класс MyService должен иметь переменные c private модификаторами, конструктор по умолчанию, get и set методы,
переопределенные методы equals и hashcode, а так же private метод (private thisClassInfo), который будет просто печатать
данные о самом классе (данные любые на ваш выбор), в котором он определен.
*/

import Lesson9.by.annotations.masalova.Version;

@Version(version = 8.1, code = "New Launch")
public class MyService {
    private double version;
    private String code;


    private void thisClassInfo() {
        System.out.println("Номер версии=" + getVersion() + ", кодовое слово-" + getCode());
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
}
