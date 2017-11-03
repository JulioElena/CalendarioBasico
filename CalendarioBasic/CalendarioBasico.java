
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    private int dia;
    private int mes;
    private int año;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        dia = 01;
        mes = 01;
        año = 01;

    }

    /**
     * Fijamos la fecha nueva 
     */
    public void setFecha(int dia,int mes,int ano)
    {
        dia = nuevoDia;
        dia = nuevoMes;
        dia = nuevoAnio;
    }

    /**
     * Metodo para obtener la fecha
     */ 
    public String obtenerFecha()
    {
        String textoADevolver = "";
        String parte1 = dia + "";
        String parte2 = mes + "";
        String parte3 = ano + "";
        if (parte1.length() < 2) {
            parte1 = "0" + parte1;  
        }
        if (mes < 10) {
            parte2 = "0" + parte2;

            if (ano < 10) {
                parte3 = "0" + parte3;
            }
            textoADevolver = parte1 + "-" + parte2 + "-" + parte3;
            return textoADevolver;
        }
        public void avanzarFecha()

            dia = dia + 1;
            if (dia == 31){
                dia = 1;
                mes = mes + 1;
                if (mes == 13) {
                    mes = 1;
                    ano += 1;
                }

            }

}
