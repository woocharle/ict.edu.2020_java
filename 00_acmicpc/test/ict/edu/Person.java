package test.ict.edu;

public class Person {
    private String name ;
    private int sum ;
    private double avg ;
    private String hak ;
    private int rank = 1;
    
    public Person() {}
    
    public Person(String name, int kor, int eng, int math) {
    	this.name = name;
    	this.sum = s_sum(kor, eng, math);
    	this.avg = s_avg(sum);
    	this.hak = s_hak(avg);
    	
    }
   
    public int s_sum(int kor, int eng, int math) {
    	return kor + eng + math;
    }
    
    public double s_avg(int sum) {
    	return (int)(sum / 3.0 * 10) / 10.0;
    }
    
    public String s_hak(double avg) {
    	
    	if (avg >= 90) {
    		hak = "A";
		} 
    	else if (avg >= 80) {
    		hak = "B";
    	}
    	else if (avg >= 70) {
    		hak = "C";
    	}
    	else {
    		hak = "F";
		}
    	
    	return hak; 
    }

    public int s_rank() {
    	return rank++;
    }

    //getter 
    
	public String getName() {
		return name;
	}

	public int getSum() {
		return sum;
	}

	public double getAvg() {
		return avg;
	}


	public String getHak() {
		return hak;
	}

	public int getRank() {
		return rank;
	}

    
}