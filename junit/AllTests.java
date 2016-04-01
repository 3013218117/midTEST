
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class AllTests {
 
	private Schedule sch;
	private Work work;
	private String name;
	private int arriveTime;
	private int serviceTime;
	
	@Before
	public void setUp(){
		work = new Work(name, arriveTime, serviceTime);
		sch = new Schedule();
	}
	
	@SuppressWarnings({ "unused", "unchecked", "unchecked" })
	@Test
	public void testFCFS(){
		
		List<Work> works = new ArrayList<Work>();
		List<Double> lst = new ArrayList<Double>();
		List<Double> lst2 = new ArrayList<Double>();
		Work w1= new Work("w1", 8, 4);
		Work w2= new Work("w2", 11, 3);
		Work w3= new Work("w3", 12, 2);
		works.add(w1);
		works.add(w2);
		works.add(w3);
		lst = sch.FCFS(works);
		lst2 =  sch.SJF(works);
		work.getPriority();
		assertEquals(lst,lst2);
		
	}
}