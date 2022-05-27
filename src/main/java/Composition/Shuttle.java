package Composition;

public class Shuttle {
    private Engine model;
    private Liveblock liveblock;
    public Person_s[] crew;

    public Engine getModel() {
        return model;
    }

    public void setModel(Engine model) {
        this.model = model;
    }

    public Liveblock getLiveblock() {
        return liveblock;
    }

    public void setLiveblock(Liveblock liveblock) {
        this.liveblock = liveblock;
    }

    public Person_s[] getCrew() {
        return crew;
    }

    public void setCrew(Person_s[] crew) {
        this.crew = crew;
    }

    public Shuttle(Engine model, Liveblock liveblock, Person_s[] crew) {
        this.model = model;
        this.liveblock = liveblock;
        this.crew = crew;


    }
}
