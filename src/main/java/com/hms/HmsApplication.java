package com.hms;

import com.hms.dao.AppointmentRepository;
import com.hms.dao.UserProfileRepository;
import com.hms.dao.UserRepository;
import com.hms.entities.Appointment;
import com.hms.entities.Enum.Gender;
import com.hms.entities.Enum.RoleType;
import com.hms.entities.Test;
import com.hms.entities.User;
import com.hms.entities.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HmsApplication.class, args);
	}

//	@Autowired
//	private AppointmentRepository appointmentRepository;
//
//	@Override
//	public void run(String... args) throws Exception {
//		Appointment appointment = new Appointment();
//		Test test1 = new Test("blood",350);
//		Test test2 = new Test("urine",250);
//		Test test3 = new Test("ecg",550);
//
//		appointment.getTests().add(test1);
//		appointment.getTests().add(test2);
//		appointment.getTests().add(test3);
//
//		appointmentRepository.save(appointment);
//
//	}


//	@Autowired
//	private UserRepository userRepository;
//
//	@Autowired
//	private UserProfileRepository userProfileRepository;
//
//	@Override
//	public void run(String... args) throws Exception {
//		UserProfile userProfile = new UserProfile();
//		userProfile.setPhoneNo(123445667L);
//		userProfile.setAddress("Muzaffarpur");
//		userProfile.setGender(Gender.Female);
//
//		User user = new User();
//		user.setRole(RoleType.Admin);
//		user.setFirstName("Aayusha");
//		user.setLastName("Srivastava");
//		user.setEmail("aayusha@gmail.com");
//		user.setPassword("abcd");
//
//		user.setUserProfile(userProfile);
//		userProfile.setUser(user);
//
//		userRepository.save(user);
//	}



}
