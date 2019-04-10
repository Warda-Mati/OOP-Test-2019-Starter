package ie.tudublin;

import processing.data.TableRow;

public class Colour 
{
    private String colour; // fields 
    private int r;
    private int g;
    private int b;
    public int value;

    

    public Colour( String colour, int r, int g, int b, int value) // constructor 
    {
        this.colour =colour;
        this.r = r;
        this.g = g;
        this.b = b;
        this.value = value;
    }


    public Colour(TableRow row) // passing table row as a parameter
    {
        this(row.getString("colour"), 
        row.getInt("r"),
        row.getInt("g"),
        row.getInt("b"),
        row.getInt("value"));
    }

    

    public String toString()
    {
        return colour +"\t" + r  +"\t" + g  +"\t" + b  +"\t" + value;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

}
    

    
    


  

   
    