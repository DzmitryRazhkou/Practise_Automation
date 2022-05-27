package Composition;

public class Drum_Set {
    private Kick kick;
    private Toms toms;
    private Snare snare;
    private Cymbals[] cymbals;

    public Kick getKick() {
        return kick;
    }

    public void setKick(Kick kick) {
        this.kick = kick;
    }

    public Toms getToms() {
        return toms;
    }

    public void setToms(Toms toms) {
        this.toms = toms;
    }

    public Snare getSnare() {
        return snare;
    }

    public void setSnare(Snare snare) {
        this.snare = snare;
    }

    public Cymbals[] getCymbals() {
        return cymbals;
    }

    public void setCymbals(Cymbals[] cymbals) {
        this.cymbals = cymbals;
    }

    public Drum_Set(Kick kick, Toms toms, Snare snare, Cymbals[] cymbals) {
        this.kick = kick;
        this.toms = toms;
        this.snare = snare;
        this.cymbals = cymbals;


    }
}
