package Week03;

class Distance {
	private String name;
	private int dist;
	
	public Distance(String name, int dist) {
		this.name = name;
		this.dist = dist;
	}

	public String getName() {
		return name;
	}

	public int getDist() {
		return dist;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDist(int dist) {
		this.dist = dist;
	}
	
	@Override
	public String toString() {
		return "Distance [이름="+ name +", 통학거리="+ dist +"]";
	}
}

class DistanceComp {
	public static Distance longdistance(Distance[] di){
		Distance longdi = di[0];
		
		for(Distance d : di) {
			if(longdi.getDist() < d.getDist()) {
				longdi = d;
			}
		}
		
		return longdi;
	}
	
	public static Distance shortdistance(Distance[] di){
		Distance shortdi = di[0];
		
		for(Distance d : di) {
			if(shortdi.getDist() > d.getDist()) {
				shortdi = d;
			}
		}
		
		return shortdi;
	}
}
