/**
 * la classe gestisce il tempo
 */

public class Time {
    private int minuti;
    private int secondi;
    private int ore;

    /**
     * prende in ingresso secondi, minuti e ore
     * 
     * @param sec int secondi
     * @param or  int ore
     * @param min int minuti
     */
    public Time(int sec, int or, int min) {
        minuti = min;
        secondi = sec;
        ore = or;
    }

    /**
     * prende in ingresso i secondi e li distribuisce
     * 
     * @param sec int secondi
     */
    public Time(int sec) {
        if (sec >= 60) {
            secondi = sec % 60;
            minuti = sec / 60;
        }
        if (minuti >= 60) {
            int min = minuti % 60;
            ore = minuti / 60;
            minuti = min;
        }
    }

    /**
     * aggiunge secondi ridistribuendoli
     * 
     * @param sec int secondi
     */
    public void addSecondi(int sec) {
        secondi = secondi + sec;
        int seconditotali = secondi;
        if (secondi >= 60) {
            secondi = seconditotali % 60;
            minuti = minuti + seconditotali / 60;
        }
        if (minuti >= 60) {
            int min = minuti % 60;
            ore = ore + minuti / 60;
            minuti = min;
        }
    }

    /**
     * ritorna tutto il tempo in secondi
     * 
     * @return int secondi totali
     */
    public int convertiSecondi() {
        return (ore * 60 * 60) + (minuti * 60) + secondi;
    }

    /**
     * ritorna i minuti
     * 
     * @return int minuti
     */
    public int getMinuti() {
        return minuti;
    }

    /**
     * ritorna le ore
     * 
     * @return int ore
     */
    public int getOre() {
        return ore;
    }

    /**
     * ritorna i secondi
     * 
     * @return int secondi
     */
    public int getSecondi() {
        return secondi;
    }

    /**
     * ritorna una stringa ordinata del tempo {ore:minuti:secondi}
     */
    public String toString() {
        return Integer.toString(ore) + ":" + Integer.toString(minuti) + ":" + Integer.toString(secondi);
    }
}
