package solvers;

import java.util.Random;
import net.sourceforge.interval.ia_math.RealInterval;

import org.junit.Ignore;
import org.junit.Test;

import testharness.TestHarness;
import algorithms.Algorithm;

public class Bisection_UnsL_CBtC_RndEqSTest {
	protected Random rnd = new Random();
	protected TestHarness test = new TestHarness();

	//	@Ignore
	@Test(timeout=12*1000) //12 sec
	public final void test1() {
		Algorithm a = new Bisection_UnsL_CBtC_RndEqS();
		final int dim = 4;
		RealInterval area = new RealInterval(-70, 10);
		test.f_DeJong_Zero(a, dim, area);
	}
	@Test(timeout=12*1000) //12 sec
	public final void test11() {
		Algorithm a = new Bisection_UnsL_CBtC_RndEqS();
		final int dim = 1;
		test.f_DeJong_NotSim(a, dim);
	}
	@Test(timeout=12*1000) //12 sec
	public final void test2() {
		Algorithm a = new Bisection_UnsL_CBtC_RndEqS();
		RealInterval area = new RealInterval(-9, 1.6);
		test.f_Price5_Zero(a, area);
	}
	@Test(timeout=12*1000) //12 sec
	public final void test3() {
		Algorithm a = new Bisection_UnsL_CBtC_RndEqS();
		RealInterval area = new RealInterval(-100, 200);
		test.f_Rastrigin10(a, area);
	}
	@Ignore
	@Test(timeout=12*1000) //12 sec
	public final void test4() {
		Algorithm a = new Bisection_UnsL_CBtC_RndEqS();
		RealInterval area = new RealInterval(-0.8, 0.8); // +-0.08984 && +-0.7
		test.f_SixHumpCamelBack(a, area);
	}
	
	
}
