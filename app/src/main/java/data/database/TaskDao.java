package data.database;

import com.google.android.gms.tasks.Task;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface TaskDao {
    @Insert
    long insertTask(TaskEntry taskEntry);

    @Update
    void updateTask(TaskEntry taskEntry);

    @Query("SELECT * FROM task")
    List<TaskEntry> getStudentList();

    @Query("SELECT * FROM task WHERE dev_esn = :esn")
    List<TaskEntry> getTaskByEsn(String esn);

    @Query("SELECT * FROM task WHERE id = :parentId")
    List<TaskEntry> getTaskByParentId(int parentId);
}
