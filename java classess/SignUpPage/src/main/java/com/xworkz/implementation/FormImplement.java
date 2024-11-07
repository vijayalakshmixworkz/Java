package com.xworkz.implementation;

import com.xworkz.dto.FormDTO;
import com.xworkz.interfaces.FormInterface;

public class FormImplement implements FormInterface {

	@Override
	public boolean printFormDetails(FormDTO form) {

		boolean valid = true;

		String userId = form.getUserId();
		if (userId != null && !userId.isEmpty() && userId.length() >= 3 && userId.length() <= 100) {
			System.out.println("userId is  valid");
			valid = true;
		} else {
			System.out.println("userId is  not valid");
			valid=false;
		}

		System.out.println("================");

		String email = form.getEmail();
		if (email != null && email.contains("@") && (email.endsWith(".com")) && email.length() >= 6
				&& email.length() <= 500) {
			System.out.println("email is valid");
			valid = true;
		} else {
			System.out.println("email is invalid");
			valid=false;
		}
		System.out.println("================");
		String password = form.getPassword();
		String confirmPassword = form.getConfirmPassword();

		if (password != null && !password.isEmpty() && password.length() > 3 && password.length() <= 10
				&& confirmPassword.equals(password)) {
			System.out.println("password is valid");
			valid = true;
		} else {
			System.out.println("password is invalid");
			valid=false;
		}

		return valid;
	}
}
