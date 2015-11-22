package com.hackgirlszju.util;

/**
 * Created by sibylla on 15/11/22.
 */

/**
 *
 任务状态：
 0 待接收(任务有效期内无接收人)
 1  失效
 (任务过期无接收人)
 2  已接收
 (任务有效期内已接收)
 3  已完成
 (任务有效期内完成)
 4  失败
 (任务有效期内失败/任务过期未完成)

 性别：
 0 男
 1 女
 */
public class Constants {

    public static int TASK_WAITING = 0;
    public static int TASK_INVALID = 1;
    public static int TASK_RECEIVED = 2;
    public static int TASK_COMPLETED = 3;
    public static int TASK_FAILED = 4;

    public static int SEX_MALE = 0;
    public static int SEX_FEMALE = 1;

}
