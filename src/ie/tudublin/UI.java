package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{
	ArrayList<Colour> colours = new ArrayList<Colour>();
	ArrayList<Resistor> resistor = new ArrayList<Resistor>();
	
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
		loadData();
		//LoadData(); // 
		PrintColour();
	
		
	}

	public void loadData() // colours  array list 
	{
		Table table = loadTable("colours.csv", "header");
		for(TableRow row :table.rows())
			{
			Colour c = new Colour(row);
			colours.add(c);
			}
	}
	public void LoadData()// resistor
	{
		Table table = loadTable("resistors", "header");
		for(TableRow row: table.rows())
		{
			Resistor res = new Resistor(value);
			resistor.add(res);
		}
	}

	public void PrintColour()  // print colour
	{
		for(Colour c: colours) // for each loop 
		{
			System.out.println(c);
		}
	}

	public Colour findColor(int value) // search colour 
	{
		for(Colour col: colours) // for each loop 
		{
			if ( value == col.value) 
				{
					return col;   // return colour
				}	
		}
		return null; // else return  null 
	}
	
	public void draw()
	{	

	}
}



