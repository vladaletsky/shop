package com.wladyslaw.shop.service;

import com.wladyslaw.shop.model.First;
import org.springframework.stereotype.Service;

@Service
public class FirstService implements FirstI {


    @Override
    public String fullName(First first) {
        return first.getName () + " " + first.getSecondName () + " " + first.getHisFather ();
    }
}
