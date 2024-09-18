package com.xworkz.examplesForInterfaces.runner;

import com.xworkz.examplesForInterfaces.things.GTMall;
import com.xworkz.examplesForInterfaces.things.MallRules;
import com.xworkz.examplesForInterfaces.things.MallRulesImpl;

public class MallRunner {

	public static void main(String[] args) {
		MallRules mallrules = new MallRulesImpl();
		System.out.println(mallrules.validId());
		GTMall gtmall = new GTMall();
		gtmall.GTMall(mallrules);
		gtmall.check();

	}

}
