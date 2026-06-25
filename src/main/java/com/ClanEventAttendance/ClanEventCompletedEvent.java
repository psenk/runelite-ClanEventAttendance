package com.ClanEventAttendance;

import java.util.List;
import lombok.Data;

@Data
public class ClanEventCompletedEvent
{
    private final List<String> attendeeNames;
    private final long durationMs;
}