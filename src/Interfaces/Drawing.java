package Interfaces;

import java.util.Arrays;

public class Drawing implements Printable {
    char[][] draw;

    public Drawing(int x, int y, char fill)
    {
        draw = new char[y][x];
        for(int i=0; i < y; i++)
        {
            Arrays.fill(draw[i],fill);
        }
    }

    public void print()
    {
        for(int i=0; i < draw.length; i++)
        {
            for(int j=0; j<draw[i].length; j++)
            {
                System.out.print(draw[i][j]);
            }
            System.out.println();
        }
    }


    public void setPoint(int x, int y, char fill)
    {
        draw[y][x] = fill;
    }



    public void drawVerticalLine(int start, int end, int x, char fill)
    {
        for(int i=start; i<=end; i++)
        {
            draw[i][x] = fill;
        }
    }



    public void drawHorizontalLine(int start, int end, int y, char fill)
    {
        for(int i=start; i<=end; i++)
        {
            draw[y][i] = fill;
        }
    }

    public void drawCirce(int x, int y, int r, char fill)
    {
        for(int i=0; i < draw.length; i++)
        {
            for(int j=0; j < draw[i].length; j++)
            {
                double dist = Math.sqrt(Math.pow(x-j, 2)+Math.pow(y-i, 2));// теорема Пифагора

                if (dist <= r)
                {
                    setPoint(j,i,fill);//заполняем
                }
            }
        }
    }


}


