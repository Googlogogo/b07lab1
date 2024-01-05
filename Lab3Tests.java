package lab3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

class Lab3Tests {

	@Test
	void testException1() {
		try{
			RationalNumber r = new RationalNumber(1,0);
			assertFalse(true);
		}
		catch(Lab3Exception ex) {
			assertEquals(ex.message, "Denominator cannot be zero");
		}
	}
	
	@Test
	void testException2() {
		try{
			SpecialNumber.computeAverage(null);
			assertFalse(true);
		}
		catch(Lab3Exception ex) {
			assertEquals(ex.message, "List cannot be empty");
		}
	}
	
	@Test
	void testException3() {
		try{
			RationalNumber r = new RationalNumber(1,1);
			r.add(new ComplexNumber(1,1));
			assertFalse(true);
		}
		catch(Lab3Exception ex) {
			assertEquals(ex.message, "Cannot add an incompatible type");
		}
	}
	
	@Test
	void testHashCode() throws Exception{
		RationalNumber r1 = new RationalNumber(1,2);
		RationalNumber r2 = new RationalNumber(2,4);
		assertEquals(r1.hashCode(), r2.hashCode());
		RationalNumber r3 = new RationalNumber(-1,2);
		RationalNumber r4 = new RationalNumber(1,-2);
		assertEquals(r3.hashCode(), r4.hashCode());
	}
	
	@Test
	void testEquals() throws Exception{
		RationalNumber r1 = new RationalNumber(1,2);
		RationalNumber r2 = new RationalNumber(2,4);
		assertEquals(r1, r2);
	}
	
	@Test
	void testAverageRationalNumber() throws Exception{
		List<SpecialNumber> A = new ArrayList<SpecialNumber>();
		A.add(new RationalNumber(3,2));
		A.add(new RationalNumber(1,1));
		A.add(new RationalNumber(1,4));
		assertEquals(SpecialNumber.computeAverage(A), new RationalNumber(11,12));
	}
	
	@Test
	void testAverageComplexNumber() throws Exception{
		List<SpecialNumber> A = new ArrayList<SpecialNumber>();
		A.add(new ComplexNumber(3,2));
		A.add(new ComplexNumber(1,1));
		A.add(new ComplexNumber(1,4));
		A.add(new ComplexNumber(5,1));
		assertEquals(SpecialNumber.computeAverage(A), new ComplexNumber(2.5,2));
	}
	
	@Test
	void testSort() throws Exception{
		List<SpecialNumber> A = new ArrayList<SpecialNumber>();
		RationalNumber a = new RationalNumber(3,2);
		RationalNumber b = new RationalNumber(1,1);
		RationalNumber c = new RationalNumber(1,4);
		
		List<SpecialNumber> L1 = new ArrayList<SpecialNumber>();
		L1.add(a); L1.add(b); L1.add(c);
		
		List<SpecialNumber> L2 = new ArrayList<SpecialNumber>();
		L2.add(c); L2.add(b); L2.add(a);
		
		L1.sort(null);
		assertEquals(L1, L2);
	}
}
