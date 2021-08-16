package SetsAndHashSet;

public class Planet extends HavenlyBody{
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }
    @Override
    public boolean addSatellite(HavenlyBody moon){
        if(moon.getBodyType() == BodyTypes.MOON){
            return super.addSatellite(moon);
        }else {
            return false;
        }
    }

}
