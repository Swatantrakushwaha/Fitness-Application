package com.Fitness.Application.Model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Activity {



    @Id
    @GeneratedValue(strategy = GenerationType.UUID)


    private String id;
    private Integer duration;

    @Enumerated(EnumType.STRING)
    private ActivityType type;

    private Integer caloriesBurned;
    private LocalDateTime startTime;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}
