package data.service;

import data.database.TaskEntry;
import data.vo.CommissioningTask;

public interface TaskService {

    CommissioningTask createTask(String devType, , String siteId, String siteName, int childTaskNum);

    boolean submitTask(CommissioningTask task);

    boolean updateTask(CommissioningTask task);
}
