package com.napier.sem;


import java.util.ArrayList;

/* Class to represent a region of the world, with appropriate instance variables and a list
of countries it contains.
 */
public class Region {

    private ArrayList<Country> countryList = new ArrayList<Country>();
    private String name;
    private long population;
    private String continent;

    public Region(){}

    public Region(String name)
    {
        setName(name);
    }

    /* method to calculate the population by summing countries in the regions' populations
    */
    public void calculatePopulation(){
        long p = 0;
        for(Country country : this.getCountryList()){
            p += ((long)country.getPopulation());
        }
        setPopulation(p);
    }

    public ArrayList<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(ArrayList<Country> countryList) {
        this.countryList = countryList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Region{" +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", continent='" + continent + '\'' +
                '}';
    }
}
