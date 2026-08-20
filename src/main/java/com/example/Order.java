package com.example;
import java.time.LocalDateTime;
public class Order {

        String companyName;
        double kilograms;
        LocalDateTime time;

        public Order(String companyName, double kilograms, LocalDateTime time) {

            this.companyName = companyName;
            this.kilograms = kilograms;
            this.time = time;
        }

        public String getCompanyName() {
            return companyName;
        }

        public double getKilograms() {
            return kilograms;
        }

        public LocalDateTime getTime() {
            return time;
        }

    }

