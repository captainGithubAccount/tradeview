package com.smartfile;

import com.smartfile.model.change.SmartFileChangeUtils;
import com.smartfile.model.change.SmartFileChangeUtils.NoticeType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NoticeTypeRandomizer {
    private static final Random RANDOM = new Random();
    
    // 指定要从中随机选择的类型
    private static final List<NoticeType> TARGET_TYPES = new ArrayList<>();
    
    static {
        // 初始化目标类型列表
        TARGET_TYPES.add(NoticeType.CLEAN);
        TARGET_TYPES.add(NoticeType.BATTERY);
        TARGET_TYPES.add(NoticeType.PROCESS);
    }
    
    /**
     * 从CLEAN, BATTERY, PROCESS三个类型中随机选择一个
     * 且不选择上一个类型（如果上一个类型在这三个中）
     * @return 随机选择的NoticeType
     */
    public static NoticeType getRandomNoticeType() {
        NoticeType lastType = SmartFileChangeUtils.INSTANCE.getLastNoticeType();
        
        // 如果上一个类型不在目标类型中，则从所有目标类型中随机选择
        if (!TARGET_TYPES.contains(lastType)) {
            return getRandomFromList(TARGET_TYPES);
        }
        
        // 上一个类型在目标类型中，则从剩余的两个类型中随机选择
        List<NoticeType> availableTypes = new ArrayList<>(TARGET_TYPES);
        availableTypes.remove(lastType);
        
        return getRandomFromList(availableTypes);
    }

    /**
     * 新增方法：从CLEAN, BATTERY, PROCESS三个类型中完全随机选择一个
     * 不考虑上一个类型是什么
     * @return 随机选择的NoticeType
     */
    public static NoticeType getRandomNoticeTypeNoLimit() {
        // 定义目标类型数组
        NoticeType[] targetTypes = {NoticeType.CLEAN, NoticeType.BATTERY, NoticeType.PROCESS};

        // 直接随机返回一个目标类型
        return targetTypes[RANDOM.nextInt(targetTypes.length)];
    }
    
    /**
     * 从指定的类型列表中随机选择一个
     * @param types 类型列表
     * @return 随机选择的类型
     */
    private static NoticeType getRandomFromList(List<NoticeType> types) {
        if (types == null || types.isEmpty()) {
            // 如果列表为空，返回CLEAN作为默认值
            return NoticeType.CLEAN;
        }

        int randomIndex = RANDOM.nextInt(types.size());
        return types.get(randomIndex);
    }


}