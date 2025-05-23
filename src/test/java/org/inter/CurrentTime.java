package org.inter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.apache.commons.compress.harmony.unpack200.bytecode.forms.MultiANewArrayForm;

public class CurrentTime {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalDate currentFDate = LocalDate.now();
        LocalDateTime dateAndTime=LocalDateTime.now();
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current Date: " + currentFDate);
        System.out.println("Current dateAndTime: " + dateAndTime);
        
    }
}