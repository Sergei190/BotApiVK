package com.example.sergei.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Database entity for saving VK API callbacks
 *
 * @author Sergei Kudryashov
 * @since 1.0
 */
@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MessageNewCallback {
    @Id
    private Long id;
    private Long date;
    private Long peerId;
    private Long fromId;
    @Column(columnDefinition="TEXT")
    private String text;
    private Long groupId;

}