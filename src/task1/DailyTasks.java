package task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DailyTasks {
    public static void main(String[] args) {
        List<String> tasks = getTasksForToday();
        for (String task : tasks) {
            System.out.println(task);
        }
    }

    public static List<String> getTasksForToday() {
        List<String> tasks = new ArrayList<>();
        LocalDate today = LocalDate.now();
        tasks.add("Complete Java assignment");
        tasks.add("Attend team meeting");
        tasks.add("Submit expense report");
        tasks.add("Exercise for 30 minutes");
        tasks.add("Call mom and wish her happy birthday");
        // add more tasks as needed

        System.out.println("Tasks for today (" + today + "):");
        return tasks;
    }
}