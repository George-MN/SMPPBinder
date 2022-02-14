package com.smpp.smsc.services;



import org.jsmpp.util.AbsoluteTimeFormatter;
import org.jsmpp.util.TimeFormatter;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;


@Service
public class SendMessages {
    private static final Logger LOGGER= org.slf4j.LoggerFactory.getLogger(SendMessages.class);
    private static final TimeFormatter TIME_FORMATTER=new AbsoluteTimeFormatter();

}
