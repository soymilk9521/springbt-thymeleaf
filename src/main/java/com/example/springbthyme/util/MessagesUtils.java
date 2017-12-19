package com.example.springbthyme.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;

@Configuration
public class MessagesUtils implements MessageSource {

    @Autowired
    private MessageSource messageSource;

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public String getMessage(String code, Object[] objs, String defaultMsg, Locale locale) {
        // get message by code, when the message is null than return defaultMsg
        return this.getMessage(code, objs, defaultMsg, locale);
    }

    @Override
    public String getMessage(String code, Object[] objs, Locale locale) throws NoSuchMessageException {
        // get message by code
        return this.messageSource.getMessage(code, objs, locale);
    }

    @Override
    public String getMessage(MessageSourceResolvable messageSourceResolvable, Locale locale) throws NoSuchMessageException {
        //
        return this.messageSource.getMessage(messageSourceResolvable, locale);
    }
}
