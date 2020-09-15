/*
 * Author : Pooja Thigle
 */
import java.lang.Math;

class Complex {

    double real, im, r, angl;
    // Constructor
    Complex(double real, double imaginary)
    {
	        this.real = real;
	        this.im = imaginary;
	    }

    // Function to display resulting Complex Number
    // in the form 'a + ib '
    @Override
   public String toString()
    {
    		return "( "+real+" + "+ im+" )";
    }

    // Arithmetic operations on complex numbers,
    Complex add(Complex c)
    {
        // add real part to real of complex c and imaginary part to imaginary part of complex c
	        Complex temp = new Complex(0, 0);
	        temp.real = real + c.real;
	        temp.im = im + c.im;
	        return temp;
    }

    Complex subtract(Complex c)
    {
        // Subtraction of two complex numbers
	        Complex temp1 = new Complex(0, 0);
	        temp1.real = real - c.real;
	        temp1.im = im - c.im;
	        return temp1;
    }

    Complex multiply(Complex c)
    {
        // Multiplication of two complex numbers
	        Complex temp2 = new Complex(0, 0);
	        temp2.real = (real * c.real) - (im * c.im);
	        temp2.im = (real * c.im) + (im * c.real);
	        return temp2;
    }

    void polar()
    {
        // Conversion of Linear to polar
	        double z;
	        z = real * real + im * im;
	        r = Math.sqrt(z);
	        angl = Math.atan2(im, real);
	        System.out.printf("\tR = %.2f", r);
	        System.out.printf("  And Angle is  %.2f \n" , angl);
    }
    void linear()
    {
        // Conversion of polar to linear
	        real = r * Math.cos(angl);
	        im = r * Math.sin(angl);
//	        System.out.print("\t( " + real+" + "+ im+"i )\n");
	        System.out.printf("\t( %.2f + %.2fi )\n", real,im);
     }
}

public class ComplexNumersClass {

	public static void main(String[] args) {

		Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(3, 2);
        System.out.print("\nComplex Numbers are : ");
        System.out.print(c1.toString());
        System.out.println("  "+c2.toString());

        System.out.print("\nAddition : ");
        Complex sum = c1.add(c2);
        System.out.println(sum.toString());

        System.out.print("\nSubtraction : ");
        Complex result = c1.subtract(c2);
        System.out.println(result.toString());

        System.out.print("\nMultiplication");
        Complex multiply = c1.multiply(c2);
        System.out.println(multiply.toString());
        
        System.out.println("\nPolar Representation : ");
        c1.polar();
        c2.polar();

        System.out.println("\nLinear Representation : ");
        c1.linear();
        c2.linear();
  
	}

}
