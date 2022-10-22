package com.hansontech.knowldgeBase;
import com.hansontech.knowldgeBase.entity.Comments;
import com.hansontech.knowldgeBase.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class KnowldgeBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(KnowldgeBaseApplication.class, args);
		Comments comments = new Comments();
		System.out.println(comments.getDate());
		}
}
