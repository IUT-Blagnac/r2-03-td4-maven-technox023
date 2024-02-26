package lesschtroumpfs;

public class Schtroumpf {
	// A Compléter
	private String nom;
	private int age;
	private boolean content;
	
	public Schtroumpf (String nom, int age) {
		this.nom=nom;
		this.age=age;
		this.content=true;
	}
	
	public String getNom() {
		return this.nom;		
	}
	
	public  int getAge() {
		return this.age;		
	}
	
	public  boolean estContent() {
		return this.content;		
	}
	
	public String toString() {
		String message="";
		if (this.content) {
			message=message+"Je suis "+ this.nom +", j’ai "+ this.age+" ans et je suis content";
		}else if(this.content==false) {
			message=message+"Je suis"+ this.nom +", j’ai"+ this.age+" ans et je suis PAS content";
		}
		return message;
	}
	public void sePresenter() { 
		System.out.println(this.toString());
	}
	
	
	public String leChant() {
		String message="";
		if (this.content=true) {
			message=message+"la, la, la Schtroumpf la, la";
		}else if(this.content=false) {
			message=message+"gloups";
		}
		return message;
	}
	public void chanter() { 
		System.out.println(this.leChant());
	}
	
	public void anniversaire() {
		this.age=this.age+1;
	}
	public void manger(int pfQte) {
		if (pfQte>0) {
			this.content=true;	
		}else {
			this.content=false;
		}
	}
	public void allerTravailler() {
		this.content=false;
	}
	
}
	
