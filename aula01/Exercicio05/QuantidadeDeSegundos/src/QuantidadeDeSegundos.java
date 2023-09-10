import java.util.Calendar;
import java.util.TimeZone;

public class QuantidadeDeSegundos {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
        int horas = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        int segundos = calendario.get(Calendar.SECOND);

        int segundosAposMeiaNoite = (minutos * 60) + (horas * 3600) + segundos;
        int segundosParaMeiaNoiteSeguinte = 86400 - segundosAposMeiaNoite;

        System.out.println("Se passaram " + segundosAposMeiaNoite + " segundos desde 00h00m0s e faltam " + segundosParaMeiaNoiteSeguinte + " segundos para meia-noite");
    }
}