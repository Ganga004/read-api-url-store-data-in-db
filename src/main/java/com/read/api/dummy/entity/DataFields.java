package com.read.api.dummy.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DataFields {
        @Id
        public int id;
        public int userId;
        public String title;
        public String body;

        public DataFields(int id, int userId, String title, String body) {
                this.id = id;
                this.userId = userId;
                this.title = title;
                this.body = body;
        }

        public DataFields() {
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public int getUserId() {
                return userId;
        }

        public void setUserId(int userId) {
                this.userId = userId;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getBody() {
                return body;
        }

        public void setBody(String body) {
                this.body = body;
        }

        @Override
        public String toString() {
                return "DataFields{" +
                        "id=" + id +
                        ", userId=" + userId +
                        ", title='" + title + '\'' +
                        ", body='" + body + '\'' +
                        '}';
        }
}
