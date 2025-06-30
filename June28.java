//Encapsulation
class person{
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String nm){
		this.name = nm;
	}
}

class Plane{
	void fly(){
		System.out.println("This is fly of Parent");
	}
}


class passengerPlane extends Plane{
	void fly(){
		super.fly();
		System.out.println("This is fly of Child");
	}
}

class Plane{
    void fly(){
        System.out.println("Plane is flying....!");
    }
}

class cargo_plane extends Plane{
    void fly(){
        System.out.println("Cargo Plane is flying...!");
    }
}
class passanger_plane extends Plane{
    void fly(){
        System.out.println("Passenger Plane is flying...!");
    }
}
    class fighter_plane extends Plane{
    void fly(){
        System.out.println("Fighter Plane is flying...!");
     }
        void carryPas(){
            System.out.println("CarryPas is flying...!");
         }
}
class Airport{
	static void Permit(plane ref){
		ref.fly();
		ref.carryPas();
	}
}

public class June28{

             int x;
             public June28(int y){
             x = y;
             }

    public static void main(String[] args) {
                 //Parameterizedconstructor
                 June28 j = new June28(10);
                 System.out.println(j.x);

         cargo_plane cp = new cargo_plane();
         passanger_plane pp= new passanger_plane();
         fighter_plane fp = new fighter_plane();
         Plane ref;

         ref = cp;
         cp.fly();
         ref = pp;
         pp.fly();
         ref = fp;
         fp.fly();

         ((fighter_plane)(ref)).carryPas();

         Airport.Permit(cp);
         Airport.Permit(pp);
         Airport.Permit(fp);

			 passengerPlane pp = new passengerPlane();
 			pp.fly();

			person p = new person();
			p.setName("Sai");
			String name = p.getName();
			System.out.println(name);

    }
}
