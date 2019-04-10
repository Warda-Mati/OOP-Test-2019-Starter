package ie.tudublin;

import processing.data.TableRow;

public class Colour 
{
    private String colour;
    private int r;
    private int g;
    private int b;
    private int value;


    public Colour(TableRow row)
    {
        this.colour = row.getString("colour");
        this.r = row.getInt("r");
        this.g = row.getInt("g");
        this.b = row.getInt("b");
        this.value = row.getInt("value");
    }

    
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString()
    {
        return colour +"\t" + r  +"\t" + g  +"\t" + b  +"\t" + value;
    }
}