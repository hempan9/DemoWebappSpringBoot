package com.example.demo.bean;

import org.springframework.stereotype.Component;
@Component
public class Bean {
        private int uid;
        private String name;
        public int getUid() {
            return uid;
        }
        public void setUid(int uid) {
            this.uid = uid;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return "bean [uid=" + uid + ", name=" + name + "]";
        }



}
