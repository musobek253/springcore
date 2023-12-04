package org.example.task.model2.task3.tk2;

public class Transform {

    public void start() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
            // Simulating an exception
            throw new RuntimeException("Simulated exception");
        } catch (Exception e) {
            // Handle the exception if needed
            System.out.println("Exception during start method: " + e.getMessage());
        }
    }
}
