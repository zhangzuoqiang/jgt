package org.hepx.tasksys.entity;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.Date;

/**
 * 工作任务
 * User: hepanxi
 * Date: 15-3-28
 * Time: 上午9:35
 */
@Alias("o_task")
public class Task extends IdEntity implements Serializable {

    private String content; //任务内容

    private Date createTime; //发布时间

    private String feedback;    //回复内容

    private Date updateTime;    //回复时间

    private TaskStaus status; //任务状态

    private Long userId;    //谁的任务

    //任务状态
    public static enum TaskStaus{
        CREATED("已创建"),
        DOING("进行中"),
        FINISH("已完成");

        private String value;

        private TaskStaus(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public TaskStaus getStatus() {
        return status;
    }

    public void setStatus(TaskStaus status) {
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", feedback='" + feedback + '\'' +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", userId=" + userId +
                '}';
    }
}
