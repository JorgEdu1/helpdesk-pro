package com.helpdesk.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tickets") //
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id; //

    @Column(nullable = false, length = 150)
    private String title; //

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description; //

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TicketStatus status; //

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TicketPriority priority; //

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false) //
    private User customer;

    @ManyToOne
    @JoinColumn(name = "assigned_to_id")
    private User assignedTo;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false) //
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at") //
    private LocalDateTime updatedAt;
}