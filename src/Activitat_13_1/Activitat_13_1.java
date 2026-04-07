package Activitat_13_1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Activitat_13_1 {
    public static void main(String[] args) throws IOException {
     createSaludo();
     createDirData();
    }
    public static void createSaludo() throws IOException {
        FileWriter melon = new FileWriter("Saludo.txt", true);
        melon.write("Hola\n");
        melon.close();
    }
    public static void createDirData() throws IOException {
        File castana = new File("data");
        castana.mkdir();
    }
//TODO de momento funciona, revisar ej 3 y sguientes.
}
