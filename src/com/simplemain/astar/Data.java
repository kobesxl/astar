package com.simplemain.astar;
import com.simplemain.astar.Point;

public class Data
{
	Point point;
	double g;
	double h;
	Data parent;
	
	public Data(Point p, double g, double h, Data parent)
	{
		this.point = p;
		this.g = g;
		this.h = h;
		this.parent = parent;
	}
	
	double f()
	{
		return g + h;
	}
}
