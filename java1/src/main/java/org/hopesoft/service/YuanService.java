package org.hopesoft.service;

import org.hopesoft.pojo.Yuan;

import java.util.List;

public interface YuanService {
    List<Yuan> getYuanByName(String name);

    List<Yuan> findAll();
}
