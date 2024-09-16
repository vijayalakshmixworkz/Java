package com.xworkz.examplesForInterfaces.runner;

import com.xworkz.examplesForInterfaces.things.IsconTemple;
import com.xworkz.examplesForInterfaces.things.TempleImplementation;

public class TempleRunner {

	public static void main(String[] args) {
		IsconTemple temple = new TempleImplementation();

        temple.removeFootwear();
        temple.followDressCode();
        temple.maintainSilence();
        temple.noPhotography();
        temple.followQueueSystem();
        temple.noLittering();
        temple.noTouchingDeities();
        temple.respectSanctity();
        temple.offerPrayers();
        temple.noOutsideFood();
	}

}
