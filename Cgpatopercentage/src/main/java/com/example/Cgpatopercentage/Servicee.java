package com.example.Cgpatopercentage;

import org.springframework.stereotype.Service;

@Service
public class Servicee {

    public float calPercentage(float cgpa) {

        if (cgpa >= 9.50 && cgpa <= 10.00) {
            return (20 * cgpa) - 100;
        }

        else if (cgpa >= 8.25 && cgpa < 9.50) {
            return (12 * cgpa) - 25;
        }

        else if (cgpa >= 6.75 && cgpa < 8.25) {
            return (10 * cgpa) - 7.5f;
        }

        else if (cgpa >= 5.75 && cgpa < 6.75) {
            return (5 * cgpa) + 26.25f;
        }

        else if (cgpa >= 5.25 && cgpa < 5.75) {
            return (10 * cgpa) - 2.5f;
        }

        else if (cgpa >= 4.75 && cgpa < 5.25) {
            return (10 * cgpa) - 2.5f;
        }

        else if (cgpa >= 4.00 && cgpa < 4.75) {
            return (6.6f * cgpa) + 13.6f;
        }

        else {
            return 0;
        }
    }
}