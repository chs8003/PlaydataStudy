package api.lang;

public class Owner {
	String name;
	String callPhone;
	
	public Owner(String name, String callPhone) {
		this.name = name;
		this.callPhone = callPhone;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    Owner o = (Owner) obj;
	    return name.equals(o.name);
	}
	
	@Override
	public String toString() {
		return "이름은"+name+"이고, 핸드폰 번호는" +callPhone+"입니다"; 
	}

	public Object getOwner() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
