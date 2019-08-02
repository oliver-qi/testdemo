package qxw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qxw.mapper.UcMapper;
import qxw.model.Uc;
import qxw.service.UcService;

@Service
public class UcServiceImpl implements UcService {

    @Autowired
    private UcMapper ucMapper;

    @Override
    public Uc getUc(Integer uid, Integer cid){
        return ucMapper.getOne(uid, cid);
    }
}
