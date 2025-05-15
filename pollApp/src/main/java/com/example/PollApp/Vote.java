package com.example.PollApp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Vote {
    private long pollId;
    private int pollIndex;
}
