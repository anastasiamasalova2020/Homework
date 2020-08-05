package Lesson9.by.annotations.masalova;

/*
Класс MyService должен иметь переменные c private модификаторами, конструктор по умолчанию, get и set методы,
переопределенные методы equals и hashcode, а так же private метод (private thisClassInfo), который будет просто печатать
данные о самом классе (данные любые на ваш выбор), в котором он определен.
*/

import Lesson9.by.annotations.masalova.Version;

import java.util.Objects;

@Version(version = 8.1, code = "New Launch")
public class MyService {
    private double version;
    private String code;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService service = (MyService) o;
        return Double.compare(service.getVersion(), getVersion()) == 0 &&
                getCode().equals(service.getCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVersion(), getCode());
    }

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
