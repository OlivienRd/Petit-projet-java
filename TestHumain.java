package POLYMORPHISME;

import java.util.ArrayList;

public class TestHumain {

	public static void main(String[] args) {
		ArrayList<EtreHumain>tab=new ArrayList<EtreHumain>();
		tab.add(new Homme());
		tab.add(new Femme());
		tab.add(new Homme());
		tab.add(new Femme());
		for(EtreHumain etreHumain:tab) {
			etreHumain.uriner();
		}
	}

}
