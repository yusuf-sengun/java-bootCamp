package SetsAndHashSet;

import java.util.HashSet;
import java.util.Set;

public abstract class HavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HavenlyBody> satellites;
    private final BodyTypes bodyType;

    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }


    public HavenlyBody(String name, double orbitalPeriod,BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

    public boolean addSatellite(HavenlyBody moon) {
            return this.satellites.add(moon);
    }

    public Set<HavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }


    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(obj instanceof  HavenlyBody){
            HavenlyBody theObject = (HavenlyBody) obj;
            if(this.name.equals(theObject.getName())){
                return this.bodyType == theObject.getBodyType();
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        System.out.println("hashCode called.");
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }

    @Override
    public String toString() {
        return this.name+": "+this.bodyType+ ", "+ this.orbitalPeriod;
    }
}
