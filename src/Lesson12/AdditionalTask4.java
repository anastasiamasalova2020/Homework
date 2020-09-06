package Lesson12;

import java.io.*;
import java.util.Objects;

//Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
//сериализации произвести обратный процесс
public class AdditionalTask4 {
    public static void main(String[] args) {
        Automobile auto = new Automobile();
        auto.setMarka("Mazda");
        auto.setSpeed(100.9);
        auto.setCost(40000);
        FileOutputStream fos = null;
        ObjectOutputStream out;
        try{
            fos = new FileOutputStream("Auto.txt");
            out = new ObjectOutputStream(fos);

            out.writeObject(auto);
            out.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        finally {
            try {
                Objects.requireNonNull(fos).close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Automobile automobile=null;
        FileInputStream fis;
        ObjectInputStream in;
        try{
            fis = new FileInputStream("Auto.txt");
            in = new ObjectInputStream(fis);
            automobile = (Automobile)in.readObject();
            in.close();
        }catch(IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
        System.out.println(automobile);
    }
}
