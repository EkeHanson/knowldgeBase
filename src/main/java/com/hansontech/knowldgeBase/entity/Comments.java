package com.hansontech.knowldgeBase.entity;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
@Entity
@Table(name="comments_tb")
public class Comments {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        @Column(name="topic_name", nullable = false)
        private String topic;
        @Column(name="first_name", nullable = false)
        private String firstName;
        @Column(name="last_name")
        private String lastName;
        @Column(name="email")
        private String email;
        @Column(name="post", length = 10000)
        private String comment;
        @Column(name="event_log")
        private String date;
    public Comments(){}
        public Comments(String topic, String firstName, String lastName,String email,String comment) {
            this.topic = topic;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.comment = comment;
            this.date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss"));}

        public Long getId() {return id;}
        public void setId(Long id) {
            this.id = id;
        }

        public String getTopic() {return topic;}

        public void setTopic(String topic) {this.topic = topic;}

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

         public String getComment() {return comment;}

         public void setComment(String comment) {this.comment = comment;}
        public String getDate() {
        return date =LocalDateTime.now().format(DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss"));}

         public void setDate(String date) {this.date = date;}
}