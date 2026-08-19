package com.example;
import java.time.LocalDateTime;
public class Order {

        String companyName;
        double kilograms;
        String LocalDateTime;

        public Order(String companyName, double kilograms, String LocalDatetime) {

            this.companyName = companyName;
            this.kilograms = kilograms;
            this.LocalDateTime = LocalDatetime;
        }

        public String getCompanyName() {
            return companyName;
        }

        public double getKilograms() {
            return kilograms;
        }

        public String getTime() {
            return LocalDateTime;
        }

    }

