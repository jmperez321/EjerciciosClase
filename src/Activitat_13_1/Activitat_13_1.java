package Activitat_13_1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Activitat_13_1 {

    public static void main(String[] args) throws IOException {
        //createSaludo();
        //createDirData();
        //createDirFecha(nomFechaCarpeta()); // EX4.1
        ex4_2_3();

    }

    public static void ex4_2_3() throws IOException {
        String nomFecha = nomFechaCarpeta();
        createDirFecha(nomFecha);
        String segons = nomSegons();
        String horesDir = nomHoraCarpeta();
        createFitxer(nomFecha,horesDir,segons);
    }
    //Ex4.1 (a) parte de fecha.
    public static String nomFechaCarpeta(){
        LocalDateTime fechaDir = LocalDateTime.now();
        DateTimeFormatter formatoDir = DateTimeFormatter.ofPattern("yyyyMMdd");
        String fechaformada = fechaDir.format(formatoDir);
        return fechaformada;
        // System.out.println(fechaformada);

    }
    //Ex3.2 (antes Ex1 y Ex2)
    public static void createSaludo() throws IOException {
        FileWriter melon = new FileWriter("data/saludo.txt", true);
        melon.write("Hola\n");
        melon.close();
    }
    // Ex3.1
    public static void createDirData() throws IOException {
        File castana = new File("data");
        castana.mkdir();
    }
    // Ex4.1 (b)
    public static void createDirFecha(String fecha) throws IOException {
        File castana = new File("data/"+fecha);
        castana.mkdir();
    }

    //Ex4.2
    public static String nomHoraCarpeta(){
        LocalDateTime horaDir = LocalDateTime.now();
        DateTimeFormatter formatoDir = DateTimeFormatter.ofPattern("HHmm");
        String horaFormada = horaDir.format(formatoDir);
        return horaFormada;
        // System.out.println(fechaformada);
    }
    public static String nomSegons(){
        LocalDateTime horaDir = LocalDateTime.now();
        DateTimeFormatter formatoDir = DateTimeFormatter.ofPattern("ss");
        String horaFormada = horaDir.format(formatoDir);
        return horaFormada;
        // System.out.println(fechaformada);
    }

    public static void createFitxer(String fecha, String hora, String segons) throws IOException {
        FileWriter melon = new FileWriter("data/"+fecha+"/"+hora+".txt", true);
        melon.write(segons+"\n");
        melon.close();
    }


}
