package com.inheritence.animal;
import com.inheritence.parent.Animals;

public class Rapitile {

		
		private boolean drySkin;
		
		public Rapitile() {
			super();  //constructor of super class aka. parent
			this.drySkin = true;
		}

		public Rapitile(boolean drySkin, boolean backBone, boolean softShelledEgg) {
//			super(backBone, softShelledEgg);
			this.drySkin = drySkin;
		}

		public Boolean getdrySkin() {
			return true;
		}


		@Override
		public String toString() {
			return "Rapitile [getdrySkin()=" + getdrySkin() + "]";
		}
		
	}



