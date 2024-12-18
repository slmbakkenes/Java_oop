package Lesson7.Practicum7;

public class CensureerProces implements OpmaakProces{
    private String teCensurerenWoord;

    public CensureerProces(String teCensurerenWoord) {
        this.teCensurerenWoord = teCensurerenWoord;
    }

    @Override
    public String maakOp(String input) {
        return input.replaceAll(teCensurerenWoord, "****");
    }
}
