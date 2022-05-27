package data.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import data.database.TaskDataBase;
import data.database.TaskEntry;
import data.vo.CommissioningTask;
import data.vo.CommissioningTaskPo;

public class TaskServiceImpl implements TaskService{
    TaskDataBase instance = TaskDataBase.getInstance();

    @Override
    public CommissioningTask createTask(String devType, String siteId, String siteName, int childTaskNum) {
        TaskDataBase instance = TaskDataBase.getInstance();

        TaskEntry taskEntry = new TaskEntry();
        taskEntry.setSiteId(siteId);
        taskEntry.setDevType(devType);
        taskEntry.setSubmit(false);
        taskEntry.setSiteName(siteName);
        long parentId = instance.taskDao().insertTask(taskEntry);

        CommissioningTask commissioningTask = new CommissioningTask();
        commissioningTask.setId((int) parentId);

        List<CommissioningTask> childTasks = new ArrayList<>();
        for (int i = 0; i < childTaskNum; i++) {
            TaskEntry childEntry = new TaskEntry();
            childEntry.setSiteId(siteId);
            childEntry.setDevType(devType);
            childEntry.setSubmit(false);
            childEntry.setName("单机" + i);
            long taskId = instance.taskDao().insertTask(childEntry);

            CommissioningTask childTask = new CommissioningTask();
            childTask.setId((int) taskId);
            childTasks.add(childTask);
        }

        if (childTaskNum > 1 && "UPS5000".equals(devType)) {
            TaskEntry entry = new TaskEntry();
            entry.setSiteId(siteId);
            entry.setDevType(devType);
            entry.setSubmit(false);
            entry.setName("并机检查");
            long taskId = instance.taskDao().insertTask(entry);

            CommissioningTask task = new CommissioningTask();
            task.setId((int) taskId);
        }

        commissioningTask.setChildTsk(childTasks);
        return commissioningTask;
    }

    @Override
    public boolean submitTask(CommissioningTask task) {
        return false;
    }

    @Override
    public boolean updateTask(CommissioningTask task) {
        TaskDataBase instance = TaskDataBase.getInstance();
        return false;
    }

    @Override
    public boolean updateTask(CommissioningTask task) {
        TaskDataBase instance = TaskDataBase.getInstance();

        return false;
    }
    
    public void getList() {
        List<CommissioningTaskPo> poList = new ArrayList<>();

        LinkedHashMap<Integer, CommissioningTask> map = new LinkedHashMap<>();

        for (CommissioningTaskPo taskPo : poList) {
            CommissioningTask commissioningTask = new CommissioningTask();
            TaskEntry taskEntry = instance.taskDao().getTaskByEsn(commissioningTask.getDevEsn()).get(0);

            if (map.containsKey(taskEntry.getId())) {
                // 说明是有父节点
            }
            if (taskEntry.getId())
        }
    }
}
