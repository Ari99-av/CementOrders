package com.example.order;

import java.time.LocalDateTime;

public class Order {

        private final String companyName;
        private final double kilograms;
        private final LocalDateTime time;

        public Order(String companyName,
                     double kilograms, LocalDateTime time) {
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

