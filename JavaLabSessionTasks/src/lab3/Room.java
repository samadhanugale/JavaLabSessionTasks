package lab3;

public class Room {
	
	int isroomno;
	String roomtype;
	String roomarea;
	String acMachine;
	
	void setData() {
		
		System.out.println("Set Data");
		this.isroomno=12;
		this.roomtype="Double";
		this.roomarea="Big";
		this.acMachine="Yes";
		
		System.out.println("Room No :"+isroomno+" Room Type "+roomtype+" Room Area "+roomarea+" AcMachine "+acMachine);
	}
	
	public void getData() {
		System.out.println("Show Data");
		System.out.println("Room No :"+isroomno+" Room Type :"+roomtype+" Room Area :"+roomarea+" AcMachine :"+acMachine);
	}



	public static void main(String[] args) {
		Room ob1=new Room();
		ob1.setData();
		ob1.getData();
	}

}
