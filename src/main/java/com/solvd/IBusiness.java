package com.solvd;

import java.util.Date;

public interface IBusiness {
    Date open();
    Date close();
    double paySallary();
    void doWork(IWorker[] workers);
}
