package com.juniverse.biorhythm;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Cálculo de los tres ciclos del biorritmo: físico (23 días), emocional (28 días) e intelectual (33 días).
 * Cada ciclo es una senoidal que vale 0 el día del nacimiento.
 *
 * @author linux
 */
public final class Biorhythm {
    
    /** Clase de utilidades: no se instancia. */
    private Biorhythm() {
    }

    /**
     * Calcula los días transcurridos desde el nacimiento hasta hoy.
     * @param year año de nacimiento
     * @param month mes (1-12)
     * @param day día del mes
     * @return días vividos, o -1 si la fecha no existe o es futura
     */
    public static long getDays(int year, int month, int day) {
        try {
            LocalDate birthDate = LocalDate.of(year, month, day);
            LocalDate currentDate = LocalDate.now();
            long days = ChronoUnit.DAYS.between(birthDate, currentDate);
            return days < 0 ? -1 : days; // una fecha futura no es válida
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return -1;
        }        
    }
    
    /**
     * Ciclo físico (23 días).
     * @param days días vividos
     * @return valor entre -1 y 1
     */
    public static double getPhysical(long days) {
        return Math.sin(2 * Math.PI * days / 23);
        
    }
    
    /**
     * Ciclo intelectual (33 días).
     * @param days días vividos
     * @return valor entre -1 y 1
     */
    public static double getIntellectual(long days) {
        return Math.sin(2 * Math.PI * days / 33);
    }
    
    /**
     * Ciclo emocional (28 días).
     * @param days días vividos
     * @return valor entre -1 y 1
     */
    public static double getEmotional(long days) {
        return Math.sin(2 * Math.PI * days / 28);
    }
}
