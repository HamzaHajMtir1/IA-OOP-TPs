package animale;

public class TestAnimalerie {

	public static void main(String[] args) {
		animale ch1=new animale("berget", "chien", "hab , hab");
		animale ca1=new animale("pitbull", "chien", "hab , hab");
		animale ca2=new animale("siamois", "chat", "miau , miau");
		System.out.println("chien num 1 :"+ch1.toString());
		System.out.println("chat num 1 :"+ca1.toString());
		System.out.println("chat num 2 :"+ca2.toString());

	}

}
