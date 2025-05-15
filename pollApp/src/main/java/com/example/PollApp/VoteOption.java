package com.example.PollApp;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Data
@NoArgsConstructor
public class VoteOption {

    @Id
    private String optionVote;

    private Long voteCount = 0L;

    // Use @JsonBackReference to mark the back part of the relationship
    @ManyToOne
    @JoinColumn(name = "poll_id", referencedColumnName = "id")
    @JsonBackReference
    private Poll poll;

    // Jackson needs a constructor with @JsonCreator
    @JsonCreator
    public VoteOption(
            @JsonProperty("optionVote") String optionVote,
            @JsonProperty("voteCount") Long voteCount
    ) {
        this.optionVote = optionVote;
        this.voteCount = voteCount;
    }
}
