package SetsAndHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String , HavenlyBody> solarSystem = new HashMap<>();
    private static Set<HavenlyBody> planets = new HashSet<>();
    public static void main(String[] args) {
        HavenlyBody temp = new Planet("Mercury",88);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new Planet("Venus",225);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        temp = new Planet("Earth",365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        HavenlyBody tempMoon = new Moon("Moon",27);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addSatellite(tempMoon);
        temp = new Planet("Mars",687);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        tempMoon = new Moon("Deimos",1.3);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addSatellite(tempMoon);
        tempMoon = new Moon("Phobos",0.3);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addSatellite(tempMoon);
        temp = new Planet("Jupiter",365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        tempMoon = new Moon("Io",0.3);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addSatellite(tempMoon);
        tempMoon = new Moon("Europa",3.5);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addSatellite(tempMoon);
        tempMoon = new Moon("Ganymede",7.1);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addSatellite(tempMoon);
        tempMoon = new Moon("Callisto",16.7);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addSatellite(tempMoon);
        temp = new Planet("Saturn",10759);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        temp = new Planet("Uranus",30660);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        temp = new Planet("Neptune",165);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        temp = new Planet("Pluto",248);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        System.out.println("planets");
        for(HavenlyBody planet : planets){
            System.out.println("\t"+planet.getName());
        }

        HavenlyBody body = solarSystem.get("Jupiter");
        System.out.println("Moons of"+ body.getName());
        for(HavenlyBody jupiterMoon : body.getSatellites()){
            System.out.println("\t"+jupiterMoon.getName());
        }

        Set<HavenlyBody> moons = new HashSet<>();
        for(HavenlyBody planet : planets){
            moons.addAll(planet.getSatellites());
        }
        System.out.println("All Moons");
        for(HavenlyBody moon: moons){
            System.out.println("\t"+moon.getName());
        }

        HavenlyBody pluto = new HavenlyBody("Pluto", 842,HavenlyBody.BodyTypes.PLANET) {
        };
        planets.add(pluto);

        for (HavenlyBody planet: planets){
            System.out.println(planet);
            //System.out.println(planet.getName() + ":" + planet.getOrbitalPeriod());
        }

        Object o = new Object();
        o.equals(o);
        "pluto".equals("");

    }
}
