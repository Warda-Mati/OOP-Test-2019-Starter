package ie.tudublin;

import processing.core.PApplet;

public class Resistor
{

    public int value;  // fields
    public int ones;
    public int tens;
    public int hundreds;
    PApplet ui;


    public Resistor( int value)
    {
        this.ones = value - ((hundreds * 100)  + (tens * 10));;
        this.tens = (value - (hundreds * 100)) / 10;;
        this.hundreds = (value / 100);;
    }
   







}