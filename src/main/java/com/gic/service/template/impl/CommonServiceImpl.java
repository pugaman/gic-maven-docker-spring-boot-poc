package com.gic.service.template.impl;

import com.gic.exception.GicException;
import com.gic.service.template.ICommonService;
import org.springframework.stereotype.Service;

/**
 * Created by pgolovenkov on 13.03.2017.
 */
@Service
public class CommonServiceImpl implements ICommonService {

    public static final String VALUE = "Hello world!";

    @Override
    public String hello() throws GicException {
        return VALUE;
    }

}
