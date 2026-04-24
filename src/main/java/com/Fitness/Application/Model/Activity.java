package com.Fitness.Application.Model;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Map;

@Entity
public class Activity {



    @Id
    @GeneratedValue(strategy = GenerationType.UUID)


    private String id;
    private Integer duration;

    @Enumerated(EnumType.STRING)
    private ActivityType type;

    @Column(columnDefinition = "json")
     private Map<String,Object> additionalMetrics;

    private Integer caloriesBurned;
    private LocalDateTime startTime;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}
