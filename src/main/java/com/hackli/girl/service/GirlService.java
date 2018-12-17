package com.hackli.girl.service;

import com.hackli.girl.domain.Girl;
import com.hackli.girl.domain.Result;
import com.hackli.girl.enums.ResultEnum;
import com.hackli.girl.exception.GirlException;
import com.hackli.girl.repository.GirlRepository;
import com.hackli.girl.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    public Result<Girl> getAge(Integer id) throws Exception{
        Girl girl = girlRepository.findById(id).get();
        Integer age = girl.getAge();
        if (age < 10) {
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        } else if (age > 10 && age < 16) {
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        } else {
            return ResultUtil.success(girl);
        }
    }

    public Girl findOne(Integer id) {
        return girlRepository.findById(id).get();
    }
}
