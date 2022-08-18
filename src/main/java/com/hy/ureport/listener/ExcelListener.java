package com.hy.ureport.listener;


import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.hy.ureport.entity.AcStatus;
import com.hy.ureport.mapper.AcParamB204Mapper;
import com.hy.ureport.mapper.AcStatusMapper;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class ExcelListener extends AnalysisEventListener<AcStatus> {

    private AcStatusMapper acStatusMapper;
    private AcParamB204Mapper acParamB204Mapper;
    //创建数据列表
    List<AcStatus> list = new ArrayList<>();
    //设置每次存储的数据大小
    private static final int BATCH_COUNT = 50;

    public ExcelListener(AcStatusMapper acStatusMapper){
        this.acStatusMapper = acStatusMapper;
    }


//    @Override
//    public void invoke(Test test, AnalysisContext analysisContext) {
//        //数据存入数据列表
//        list.add(test);
//        if(list.size() >= BATCH_COUNT){
//            saveData();
//            list.clear();
//        }
//    }

    @Override
    public void invoke(AcStatus acStatus, AnalysisContext analysisContext) {
        //数据存入数据列表
        list.add(acStatus);
        if(list.size() >= BATCH_COUNT){
            saveData();
            list.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        //当剩余数据小于batchcount时，最终一次性存储
        saveData();
    }

    private void saveData(){
        acStatusMapper.insertBatch(list);

    }
}
