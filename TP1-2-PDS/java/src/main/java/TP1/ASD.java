package TP1;

import java.util.ArrayList;
import java.util.List;

public class ASD {

	public ASD() {


		static public class Document {

			private ArrayList<Triplet> list = new ArrayList<Triplet>();

			public Document(ArrayList<Triplet> list) {
				super();
				this.list = list;
			}

			public String toNtriples() {

				return "...";
			}

			public ArrayList<Triplet> getList() {
				return list;
			}

			public void setList(ArrayList<Triplet> list) {
				this.list = list;
			}


		}

		abstract class Object {
			
		}

		class Triplet extends Object {

			private Sujet sujet = new Sujet();

			private ArrayList<Attribut> list = new ArrayList<Attribut>();

			public Triplet(ArrayList<Attribut> list, Sujet sujet) {
				super();
				this.list = list;
				this.sujet = sujet;
			}
			public String toNtriples() {

				return "...";
			}

		}

		class Attribut extends Object {


			private Verbe verbe = new Verbe();

			private ArrayList<Complement> list = new ArrayList<Complement>();

			public Attribut(ArrayList<Complement> list, Verbe verbe) {
				super();
				this.list = list;
				this.verbe = verbe;
			}
			public String toNtriples() {

				return "...";
			}
		}

		class Sujet extends Object {

			private Entite entite = new Entite();

			public Sujet(Entite entite) {
				super();
				this.entite = entite;
			}

			public String toNtriples() {

				return "...";
			}

		}

		class Verbe extends Object {

			private Entite entite = new Entite();

			public Verbe(Entite entite) {
				super();
				this.entite = entite;
			}
			public String toNtriples() {

				return "...";
			}

		}

		class Complement extends Object {

			private Entite entite = new Entite();

			private String str;

			public Complement(Entite entite, String str) {
				super();
				this.entite = entite;
				this.str = str;
			}

			public String toNtriples() {

				return "...";
			}

		}

		class Entite {

			private String str;

			public Entite(String str) {
				super();
				this.str = str;
			}

			public String toNtriples() {

				return "...";
			}
		}
	}
}
