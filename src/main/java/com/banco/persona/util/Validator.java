package com.banco.persona.util;

import com.banco.persona.exception.UnprocessableEntity;
import com.banco.persona.model.User;
import org.springframework.stereotype.Service;

@Service
public interface Validator {

    void validator(User request) throws UnprocessableEntity;

}
