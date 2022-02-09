package org.hopesoft.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.hopesoft.mapper.YuanMapper;
import org.hopesoft.pojo.Yuan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YuanServiceImpl implements YuanService{
    @Autowired
    private YuanMapper yuanMapper;


    @Override
    public List<Yuan> getYuanByName(String name) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("name",name);
        return yuanMapper.selectList(queryWrapper);
    }

    @Override
    public List<Yuan> findAll() {
        return yuanMapper.selectList(null);
    }
}
