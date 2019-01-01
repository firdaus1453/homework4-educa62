package com.educa62.backgroundtask;


import com.firebase.jobdispatcher.JobParameters;
import com.firebase.jobdispatcher.JobService;

public class MyFirebaseJobService extends JobService {
    @Override
    public boolean onStartJob(JobParameters params) {
        // lakukan background task atau memanggil service
        MyIntentService.startActionJobService(this, "hello", "I Am Firebase");
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return true;
    }
}
