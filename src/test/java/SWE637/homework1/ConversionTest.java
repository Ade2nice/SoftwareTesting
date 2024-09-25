package SWE637.homework1;

import org.junit.Test;

import static org.junit.Assert.*;


import org.junit.Before;

public class ConversionTest {
	private conversion conversion;
	
	@Before
	public void setUp() {
		this.conversion = new conversion();
	}
	
	@Test
	public void convertTemperature() {
		
			// Observability: The Try and catch method shows the observability of our test in the convertTemperature test method.
			// We can observe the reaction to null, empty strings, and non-numerical values.
				
			//Catch null values that are null in the convertF2C
				try {
		            conversion.convertF2C(null);  
		            fail("Expected NullPointerException to be thrown");
		        } catch (NullPointerException e) {
		           
		        }
			//Catch empty strings
				try {
		            conversion.convertF2C("");  
		            fail("Expected IllegalArgumentException to be thrown");
		        } catch (IllegalArgumentException e) {

		        }	
			//catch number format exception 
				try {
		            conversion.convertF2C("e"); 
		            fail("Expected NumberFormatException to be thrown");
		        } catch (NumberFormatException e) {
		        	
				}
				
				
			//Controllability: The conversion.convert function lets us get an input to be evaluated.
			
			// Correct Values for conversion from Fahrenheit to Celsius
			assertEquals("Conversion is not correct", 0.0, conversion.convertF2C("32"),0.01);
			assertEquals("Conversion is not correct",4.44, conversion.convertF2C("40"),0.01);
			
			
			//Testing Decimal inputs 
			assertEquals("Conversion is not correct",-14.92, conversion.convertF2C("5.14"),0.01);
			
			//Testing Negative Decimal inputs 
			assertEquals("Conversion is not correct",-20.63, conversion.convertF2C("-5.14"),0.01);
			
			//Trying negative values
			assertEquals(-23.33, conversion.convertF2C("-10"), 0.01);
			//Trying zero
			assertEquals(-17.78, conversion.convertF2C("0"), 0.01);
		
		
		
		//*************************************************************************************	
		//*************************************************************************************	
		//*************************************************************************************		
		//*************************************************************************************	
		// Conversion from Celsius to Fahrenheit 
	
		// Observability: The Try and catch method shows the observability of our test in the convertTemperature test method.
		// We can observe the reaction to null, empty strings, and non-numerical values.
			
			//Catch null values that are null in the convertC2F
					try {
			            conversion.convertC2F(null);  
			            fail("Expected NullPointerException to be thrown");
			        } catch (NullPointerException e) {
			           
			        }
			//Catch empty strings
					try {
			            conversion.convertC2F("");  
			            fail("Expected IllegalArgumentException to be thrown");
			        } catch (IllegalArgumentException e) {
		
			        }	
			//catch number format exception 
					try {
			            conversion.convertC2F("e");
			            fail("Expected NumberFormatException to be thrown");
			        } catch (NumberFormatException e) {
			        	
					}
					
					
			//Controllability: The conversion.convert function lets us get an input to be evaluated.
					
			// Correct Values for conversion from Celsius to Fahrenheit
			assertEquals("Conversion is not correct", 68, conversion.convertC2F("20"),0.01);
			assertEquals("Conversion is not correct",53.6, conversion.convertC2F("12"),0.01);
			
			
			//Testing Decimal inputs 
			assertEquals("Conversion is not correct",-5.14, conversion.convertC2F("-20.63333"),0.01);
			//Testing Negative Decimal inputs 
			assertEquals("Conversion is not correct",22.75, conversion.convertC2F("-5.14"),0.01);
			
			//Trying negative values
			assertEquals(14, conversion.convertC2F("-10"), 0.01);
			//Trying zero
			assertEquals(32, conversion.convertC2F("0"), 0.01);
			}
	
	
	@Test
	public void convertSmallDistances() {
		
		// Observability: The Try and catch method shows the observability of our test in the convertTemperature test method.
		// We can observe the reaction to null, empty strings, and non-numerical values.
		
				//Catch null values that are null in the convertIn2Cm
				try {
		            conversion.convertIn2Cm(null);  
		            fail("Expected NullPointerException to be thrown");
		        } catch (NullPointerException e) {
		           
		        }
			//Catch empty strings
				try {
		            conversion.convertIn2Cm ("");  
		            fail("Expected IllegalArgumentException to be thrown");
		        } catch (IllegalArgumentException e) {
		
		        }	
			//catch number format exception 
				try {
		            conversion.convertIn2Cm ("e");  
		            fail("Expected NumberFormatException to be thrown");
		        } catch (NumberFormatException e) {
		        	
				}
				
				
				//Controllability: The conversion.convert function lets us get an input to be evaluated.
				
			// Correct Values for Conversion from inches to centimeters
			assertEquals("Conversion is not correct", 2.54, conversion.convertIn2Cm ("1"),0.01);
			assertEquals("Conversion is not correct",101.6, conversion.convertIn2Cm ("40"),0.01);
			
			//Testing Decimal inputs 
			assertEquals("Conversion is not correct",12.95, conversion.convertIn2Cm("5.1"),0.01);
			//Testing Negative Decimal inputs 
			assertEquals("Conversion is not correct",-12.95, conversion.convertIn2Cm("-5.1"),0.01);
			
			//Trying negative values
			assertEquals(-25.4, conversion.convertIn2Cm("-10"), 0.01);
			//Trying zero
			assertEquals(0, conversion.convertIn2Cm("0"), 0.01);
	
	//*************************************************************************************	
	//*************************************************************************************	
	//*************************************************************************************		
	//*************************************************************************************	
	// Conversion from centimeters to inches 
	
			
	// Observability: The Try and catch method shows the observability of our test in the convertTemperature test method.
	// We can observe the reaction to null, empty strings, and non-numerical values.
			
			
		//Catch null values that are null in the convertCm2In
			try {
		        conversion.convertCm2In(null);  
		        fail("Expected NullPointerException to be thrown");
		    } catch (NullPointerException e) {
		       
		    }
		//Catch empty strings
			try {
		        conversion.convertCm2In("");  
		        fail("Expected IllegalArgumentException to be thrown");
		    } catch (IllegalArgumentException e) {
		
		    }	
		//catch number format exception 
			try {
		        conversion.convertCm2In("e");  
		        fail("Expected NumberFormatException to be thrown");
		    } catch (NumberFormatException e) {
		    	
			}
			
		// Correct Values for Conversion from centimeters to inches 
		assertEquals("Conversion is not correct", 0.39, conversion.convertCm2In ("1"),0.01);
		assertEquals("Conversion is not correct",15.74, conversion.convertCm2In ("40"),0.01);
		
		//Testing Decimal inputs 
		assertEquals("Conversion is not correct",2.00, conversion.convertCm2In("5.1"),0.01);
		//Testing Negative Decimal inputs 
		assertEquals("Conversion is not correct",-2.00, conversion.convertCm2In("-5.1"),0.01);
		
		//Trying negative values
		assertEquals(-3.94, conversion.convertCm2In("-10"), 0.01);
		//Trying zero
		assertEquals(0, conversion.convertCm2In("0"), 0.01);
	
	}
	
	@Test
	public void convertMediumDistance(){
		// Observability: The Try and catch method shows the observability of our test in the convertTemperature test method.
		// We can observe the reaction to null, empty strings, and non-numerical values.
		
		
		//Catch null values that are null in the convertF2M
		try {
            conversion.convertF2M (null);  
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
           
        }
	//Catch empty strings
		try {
            conversion.convertF2M ("");  
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {

        }	
	//catch number format exception 
		try {
            conversion.convertF2M ("e");  
            fail("Expected NumberFormatException to be thrown");
        } catch (NumberFormatException e) {
        	
		}
		
	// Correct Values for Conversion from inches to centimeters
	assertEquals("Conversion is not correct", 0.30, conversion.convertF2M("1"),0.01);
	assertEquals("Conversion is not correct",12.19, conversion.convertF2M("40"),0.01);
	
	//Testing Decimal inputs 
	assertEquals("Conversion is not correct",1.55, conversion.convertF2M("5.1"),0.01);
	//Testing Negative Decimal inputs 
	assertEquals("Conversion is not correct",-1.55, conversion.convertF2M("-5.1"),0.01);
	
	//Trying negative values
	assertEquals(-3.05, conversion.convertF2M("-10"), 0.01);
	//Trying zero
	assertEquals(0, conversion.convertF2M("0"), 0.01);
		
	//*************************************************************************************	
	//*************************************************************************************	
	//*************************************************************************************		
	//*************************************************************************************	
	// Conversion from meters to feet
	
	
	// Observability: The Try and catch method shows the observability of our test in the convertTemperature test method.
	// We can observe the reaction to null, empty strings, and non-numerical values.
	
	
	//Catch null values that are null in the convertF2M
			try {
	            conversion.convertM2F (null);  
	            fail("Expected NullPointerException to be thrown");
	        } catch (NullPointerException e) {
	           
	        }
		//Catch empty strings
			try {
	            conversion.convertM2F("");  
	            fail("Expected IllegalArgumentException to be thrown");
	        } catch (IllegalArgumentException e) {

	        }	
		//catch number format exception 
			try {
	            conversion.convertM2F ("e");  
	            fail("Expected NumberFormatException to be thrown");
	        } catch (NumberFormatException e) {
	        	
			}
			
		//Controllability: The conversion.convert function lets us get an input to be evaluated.	
			
		// Correct Values for Conversion from meters to feet
		assertEquals("Conversion is not correct", 3.28, conversion.convertM2F("1"),0.01);
		assertEquals("Conversion is not correct",131.23, conversion.convertM2F("40"),0.01);
		
		//Testing Decimal inputs 
		assertEquals("Conversion is not correct",16.73, conversion.convertM2F("5.1"),0.01);
		//Testing Negative Decimal inputs 
		assertEquals("Conversion is not correct",-16.73, conversion.convertM2F("-5.1"),0.01);
		
		//Trying negative values
		assertEquals(-32.81, conversion.convertM2F("-10"), 0.01);
		//Trying zero
		assertEquals(0, conversion.convertM2F("0"), 0.01);
	
	
	
	}
	@Test
	public void convertLargeDistance() {
		
		// Observability: The Try and catch method shows the observability of our test in the convertTemperature test method.
		// We can observe the reaction to null, empty strings, and non-numerical values.
		
		
		//Catch null values that are null in the convertM2K
		try {
            conversion.convertM2K(null);  
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
           
        }
	//Catch empty strings
		try {
            conversion.convertM2K ("");  
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {

        }	
	//catch number format exception 
		try {
            conversion.convertM2K("e");  
            fail("Expected NumberFormatException to be thrown");
        } catch (NumberFormatException e) {
        	
		}
		
	//Controllability: The conversion.convert function lets us get an input to be evaluated.	
		
	// Correct Values for Conversion from miles to kilometers
	assertEquals("Conversion is not correct", 1.61, conversion.convertM2K ("1"),0.01);
	assertEquals("Conversion is not correct",64.37, conversion.convertM2K ("40"),0.01);
	
	//Testing Decimal inputs 
	assertEquals("Conversion is not correct",8.21, conversion.convertM2K("5.1"),0.01);
	//Testing Negative Decimal inputs 
	assertEquals("Conversion is not correct",-8.21, conversion.convertM2K("-5.1"),0.01);
	
	//Trying negative values
	assertEquals(-16.09, conversion.convertM2K("-10"), 0.01);
	//Trying zero
	assertEquals(0, conversion.convertM2K("0"), 0.01);
	
	//*************************************************************************************	
	//*************************************************************************************	
	//*************************************************************************************		
	//*************************************************************************************	
	// Conversion from kilometers to miles 
	
	
	
	// Observability: The Try and catch method shows the observability of our test in the convertTemperature test method.
	// We can observe the reaction to null, empty strings, and non-numerical values.
			
	//Catch null values that are null in the convertM2K
		try {
            conversion.convertK2M(null);  
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
           
        }
	//Catch empty strings
		try {
            conversion.convertK2M ("");  
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {

        }	
	//catch number format exception 
		try {
            conversion.convertK2M ("e");  
            fail("Expected NumberFormatException to be thrown");
        } catch (NumberFormatException e) {
        	
		}
		
		//Controllability: The conversion.convert function lets us get an input to be evaluated.	
			
		// Correct Values for Conversion from kilometers to miles
		assertEquals("Conversion is not correct",0.62, conversion.convertK2M  ("1"),0.01);
		assertEquals("Conversion is not correct",24.86, conversion.convertK2M ("40"),0.01);
		
		//Testing Decimal inputs 
		assertEquals("Conversion is not correct",3.17, conversion.convertK2M ("5.1"),0.01);
		//Testing Negative Decimal inputs 
		assertEquals("Conversion is not correct",-3.17, conversion.convertK2M ("-5.1"),0.01);
		
		//Trying negative values
		assertEquals(-6.21, conversion.convertK2M ("-10"), 0.01);
		//Trying zero
		assertEquals(0, conversion.convertK2M ("0"), 0.01);
	
	}
	
	
	
	@Test
	public void convertVolume() {
		//conversion from gallons to liters
		
		// Observability: The Try and catch method shows the observability of our test in the convertTemperature test method.
		// We can observe the reaction to null, empty strings, and non-numerical values.
		
		try {
            conversion.convertG2L(null);  
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
           
        }
	//Catch empty strings
		try {
            conversion.convertG2L ("");  
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {

        }	
	//catch number format exception 
		try {
            conversion.convertG2L("e");  
            fail("Expected NumberFormatException to be thrown");
        } catch (NumberFormatException e) {
        	
		}
		
		//Controllability: The conversion.convert function lets us get an input to be evaluated.	
		
		
			
		// Correct Values for Conversion from gallons to liters
		assertEquals("Conversion is not correct",3.79, conversion.convertG2L("1"),0.01);
		assertEquals("Conversion is not correct",151.40, conversion.convertG2L("40"),0.01);
		
		//Testing Decimal inputs 
		assertEquals("Conversion is not correct",19.30, conversion.convertG2L("5.1"),0.01);
		//Testing Negative Decimal inputs 
		assertEquals("Conversion is not correct",-19.30, conversion.convertG2L("-5.1"),0.01);
		
		//Trying negative values
		assertEquals(-37.85, conversion.convertG2L("-10"), 0.01);
		//Trying zero
		assertEquals(0, conversion.convertG2L("0"), 0.01);
	
		
		//*************************************************************************************	
		//*************************************************************************************	
		//*************************************************************************************		
		//*************************************************************************************	
		// Conversion from liters to gallons 
		
		
		// Observability: The Try and catch method shows the observability of our test in the convertTemperature test method.
		// We can observe the reaction to null, empty strings, and non-numerical values.
		
		try {
            conversion.convertL2G (null);  
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
           
        }
	//Catch empty strings
		try {
            conversion.convertL2G  ("");  
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {

        }	
	//catch number format exception 
		try {
            conversion.convertL2G ("e");  
            fail("Expected NumberFormatException to be thrown");
        } catch (NumberFormatException e) {
        	
		}
		//Controllability: The conversion.convert function lets us get an input to be evaluated.
		
		
		// Correct Values for Conversion from liters to gallons 
		assertEquals("Conversion is not correct",0.26, conversion.convertL2G ("1"),0.01);
		assertEquals("Conversion is not correct",10.57, conversion.convertL2G ("40"),0.01);
		
		//Testing Decimal inputs 
		assertEquals("Conversion is not correct",1.35, conversion.convertL2G ("5.1"),0.01);
		//Testing Negative Decimal inputs 
		assertEquals("Conversion is not correct",-1.35, conversion.convertL2G ("-5.1"),0.01);
		
		//Trying negative values
		assertEquals(-2.64, conversion.convertL2G ("-10"), 0.01);
		//Trying zero
		assertEquals(0, conversion.convertL2G("0"), 0.01);
		
		
		
	}
		
	@Test
	public void convertSmallWeight() {
		//conversion from   ounces to grams
		
		// Observability: The Try and catch method shows the observability of our test in the convertTemperature test method.
		// We can observe the reaction to null, empty strings, and non-numerical values.
		
			try {
	            conversion. convertOz2G (null);  
	            fail("Expected NullPointerException to be thrown");
	        } catch (NullPointerException e) {
	           
	        }
		//Catch empty strings
			try {
	            conversion. convertOz2G  ("");  
	            fail("Expected IllegalArgumentException to be thrown");
	        } catch (IllegalArgumentException e) {

	        }	
		//catch number format exception 
			try {
	            conversion. convertOz2G ("e");  
	            fail("Expected NumberFormatException to be thrown");
	        } catch (NumberFormatException e) {
	        	
			}
			//Controllability: The conversion.convert function lets us get an input to be evaluated.
				
			// Correct Values for Conversion from ounces to grams
			assertEquals("Conversion is not correct",28.35, conversion. convertOz2G ("1"),0.01);
			assertEquals("Conversion is not correct",1133.99, conversion. convertOz2G ("40"),0.01);
			
			//Testing Decimal inputs 
			assertEquals("Conversion is not correct",144.58, conversion. convertOz2G ("5.1"),0.01);
			//Testing Negative Decimal inputs 
			assertEquals("Conversion is not correct",-144.58, conversion. convertOz2G ("-5.1"),0.01);
			
			//Trying negative values
			assertEquals(-283.49, conversion.convertOz2G("-10"), 0.01);
			//Trying zero
			assertEquals(0, conversion. convertOz2G("0"), 0.01);
			
			
			//*************************************************************************************	
			//*************************************************************************************	
			//*************************************************************************************		
			//*************************************************************************************	
			// Conversion from grams to ounce
			
			
			// Observability: The Try and catch method shows the observability of our test in the convertTemperature test method.
			// We can observe the reaction to null, empty strings, and non-numerical values.
			
			try {
	            conversion. convertG2Oz  (null);  
	            fail("Expected NullPointerException to be thrown");
	        } catch (NullPointerException e) {
	           
	        }
		//Catch empty strings
			try {
	            conversion. convertG2Oz   ("");  
	            fail("Expected IllegalArgumentException to be thrown");
	        } catch (IllegalArgumentException e) {

	        }	
		//catch number format exception 
			try {
	            conversion. convertG2Oz  ("e");  
	            fail("Expected NumberFormatException to be thrown");
	        } catch (NumberFormatException e) {
	        	
			}
				
			//Controllability: The conversion.convert function lets us get an input to be evaluated.
			
			// Correct Values for Conversion from grams to ounce
			assertEquals("Conversion is not correct",0.035, conversion. convertG2Oz  ("1"),0.01);
			assertEquals("Conversion is not correct",1.41, conversion. convertG2Oz  ("40"),0.01);
			
			//Testing Decimal inputs 
			assertEquals("Conversion is not correct",0.18, conversion. convertG2Oz  ("5.1"),0.01);
			//Testing Negative Decimal inputs 
			assertEquals("Conversion is not correct",-0.18, conversion. convertG2Oz  ("-5.1"),0.01);
			
			//Trying negative values
			assertEquals(-0.35, conversion.convertG2Oz ("-10"), 0.01);
			//Trying zero
			assertEquals(0, conversion. convertG2Oz("0"), 0.01);
		
	}
	
	@Test
	public void convertMediumWeight() {
		
		
		// Observability: The Try and catch method shows the observability of our test in the convertTemperature test method.
		// We can observe the reaction to null, empty strings, and non-numerical values.
		
		try {
            conversion. convertLb2K(null);  
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
           
        }
	//Catch empty strings
		try {
            conversion. convertLb2K ("");  
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {

        }	
	//catch number format exception 
		try {
            conversion. convertLb2K ("e");  
            fail("Expected NumberFormatException to be thrown");
        } catch (NumberFormatException e) {
        	
		}
		
		
		//Controllability: The conversion.convert function lets us get an input to be evaluated.
		
		// Correct Values for Conversion from pounds to kilograms
		assertEquals("Conversion is not correct",0.45, conversion. convertLb2K  ("1"),0.01);
		assertEquals("Conversion is not correct",18.14, conversion. convertLb2K   ("40"),0.01);
		
		//Testing Decimal inputs 
		assertEquals("Conversion is not correct",2.31, conversion. convertLb2K  ("5.1"),0.01);
		//Testing Negative Decimal inputs 
		assertEquals("Conversion is not correct",-2.31, conversion. convertLb2K   ("-5.1"),0.01);
		
		//Trying negative values
		assertEquals(-4.54, conversion.convertLb2K  ("-10"), 0.01);
		//Trying zero
		assertEquals(0, conversion. convertLb2K ("0"), 0.01);
		
		
		
		//*************************************************************************************	
		//*************************************************************************************	
		//*************************************************************************************		
		//*************************************************************************************	
		// Conversion from kilograms to pounds
		
		// Observability: The Try and catch method shows the observability of our test in the convertTemperature test method.
		// We can observe the reaction to null, empty strings, and non-numerical values.
		
		try {
            conversion. convertK2Lb(null);  
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
           
        }
	//Catch empty strings
		try {
            conversion. convertK2Lb ("");  
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {

        }	
	//catch number format exception 
		try {
            conversion. convertK2Lb ("e");  
            fail("Expected NumberFormatException to be thrown");
        } catch (NumberFormatException e) {
        	
		}
		
		//Controllability: The conversion.convert function lets us get an input to be evaluated.
		
		// Correct Values for Conversion from kilograms to pounds
		assertEquals("Conversion is not correct",2.21, conversion. convertK2Lb  ("1"),0.01);
		assertEquals("Conversion is not correct",88.19, conversion. convertK2Lb  ("40"),0.01);
		
		//Testing Decimal inputs 
		assertEquals("Conversion is not correct",11.24, conversion. convertK2Lb ("5.1"),0.01);
		//Testing Negative Decimal inputs 
		assertEquals("Conversion is not correct",-11.24, conversion. convertK2Lb ("-5.1"),0.01);
		
		//Trying negative values
		assertEquals(-22.05, conversion.convertK2Lb ("-10"), 0.01);
		//Trying zero
		assertEquals(0, conversion. convertK2Lb ("0"), 0.01);
		
		

	}
	
}
