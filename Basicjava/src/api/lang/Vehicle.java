package api.lang;

public class Vehicle {
	private Owner owner;
	int price;
	
	@Override
	public boolean equals(Object obj) {
	    if (obj ==null & obj instanceof Vehicle) {
	    	Vehicle v = (Vehicle) obj;
	    	if(this.owner.equals(v.owner.getOwner())) {
	    		return true;
	    	}
	    }
	    return false;
	   
	}
	
	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "이름은"+owner.name+"이고, 핸드폰 번호는" +owner.callPhone+"입니다"+"차량번호: 가격은"+ price+"입니다" ; 
	}
}
