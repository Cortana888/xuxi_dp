package Á·Ï°;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class dp_test {
	dp d = null;
	@Before
	public void set_up(){
		d = new dp();
	}
	@Test
	public void test_1() {
		int arr[]={-1,-1,-1,-1,-1};
		Assert.assertEquals(d.max_string(arr), 0);
	}
	@Test
	public void test_2() {
		int arr[]={0,0,0,0,0};
		Assert.assertEquals(d.max_string(arr), 0);
	}
	@Test
	public void test_3() {
		int arr[]={1,2,3,4,5};
		Assert.assertEquals(d.max_string(arr), 15);
	}
	@Test
	public void test_4() {
		int arr[]={-2,11,-4,13,-5,-2};
		Assert.assertEquals(d.max_string(arr), 20);
	}
	@Test
	public void test_5() {
		int arr[]={1,2,-4,8,-1};
		Assert.assertEquals(d.max_string(arr), 8);
	}

}
