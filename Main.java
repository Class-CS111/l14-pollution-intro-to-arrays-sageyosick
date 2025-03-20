// YOUR NAME: Sage Yosick
// COLLABORATORS:
// LAST MODIFIED DATE: 
/*
Yearly Global Atmospheric CO₂ Levels (parts per million)
2001: 371.32 ppm
2002: 373.45 ppm
2003: 375.98 ppm
2004: 377.70 ppm
2005: 379.98 ppm
2006: 382.09 ppm
2007: 384.03 ppm
2008: 385.83 ppm
2009: 387.64 ppm
2010: 390.10 ppm
2011: 391.85 ppm
2012: 394.06 ppm
2013: 396.74 ppm
2014: 398.87 ppm
2015: 401.01 ppm
2016: 404.41 ppm
2017: 406.76 ppm
2018: 408.72 ppm
2019: 411.66 ppm
2020: 414.24 ppm
(Data from: https://www.esrl.noaa.gov/gmd/webdata/ccgg/trends/co2/co2_annmean_mlo.txt)
*/

class Main 
{
	//CONSTANTS SECTION

  public static void main(String[] args) 
  {
		// DECLARATION + INITIALIZATION SECTION
    int size = 20;
    double[] co2Levels = new double[size];
    int[] years = new int[size]; 

    co2Levels[0] = 371.32; //2001
    co2Levels[1] = 373.45; //2002
    co2Levels[2] = 375.98;
    co2Levels[3] = 377.70;
    co2Levels[4] = 379.98;
    co2Levels[5] = 382.09;
    co2Levels[6] = 384.03;
    co2Levels[7] = 385.83;
    co2Levels[8] = 387.64;
    co2Levels[9] = 390.10;
    co2Levels[10] = 391.85;
    co2Levels[11] = 394.06;
    co2Levels[12] = 396.74;
    co2Levels[13] = 398.87;
    co2Levels[14] = 401.01;
    co2Levels[15] = 404.41;
    co2Levels[16] = 406.76;
    co2Levels[17] = 408.72;
    co2Levels[18] = 411.66;
    co2Levels[19] = 414.24;

    int currentYear = 2001;
    for(int i = 0; i < years.length; i++) {
        years[i] = currentYear;
        currentYear++;

    }


		// INPUT SECTION 

		// PROCESSING SECTION

		// OUTPUT SECTION
  
    //Explanation of oil drum units
    System.out.println("\nData displayed for each year begins at 360 ppm.\nEach additional oil drum (🛢 ) represents an additional 10 ppm.\n");

    //Column titles of graph
    System.out.print("Year");
    UtilityBelt.printCentered(55,"CO₂ in Atmosphere (ppm)");

    Main.printGraph(co2Levels, years);

    double averageLevels = co2Levels[size-1] - co2Levels[0];
    System.out.printf("From 2001 to 2020, the average atmospheric CO₂ levels across the globe has grown %.2f ppm.%n", averageLevels);
  }

  public static void printGraph(double[] dataValues, int[] yearValues) {
    for(int i = 0; i < dataValues.length; i++) {
      System.out.print(yearValues[i] + " ");
      Main.printBar(dataValues[i]); 
    }

  }

  public static void printBar(double data) {
    int numDrums = (int)(data - 360);
    for(int i = 0; i < numDrums; i++) {
      System.out.print("🛢");
    }
    //System.out.println(" " + data);
    System.out.printf(" %.2f%n", data);
  }

}